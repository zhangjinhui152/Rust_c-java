import urllib
import requests
from qcloud_cos import CosConfig
from qcloud_cos import CosS3Client
import sys
import logging
import json
import time
import re
from tencentcloud.common import credential
from tencentcloud.common.profile.client_profile import ClientProfile
from tencentcloud.common.profile.http_profile import HttpProfile
from tencentcloud.common.exception.tencent_cloud_sdk_exception import TencentCloudSDKException
from tencentcloud.asr.v20190614 import asr_client, models

class UrlGet():
    """
    设置并获取url 注意获取的是url列表
    """
    def __init__(self,secret_id,secret_key,region):
        """
        设置并获取url 注意获取的是url列表
        """
        self.__secret_id  =secret_id
        self.__secret_key = secret_key
        self.__region = region
        self.__scheme = 'https' 
        self.__token = None
        logging.basicConfig(level=logging.INFO, stream=sys.stdout)
        config = CosConfig(Region=self.__region, SecretId=self.__secret_id,SecretKey=self.__secret_key, Token=self.__token, Scheme=self.__scheme)
        # 2. 获取客户端对象
        self.__client = CosS3Client(config)
        self.__Bucket_appid = "1earning-1305041181"
        self.__KeyList = list()
        self.__UrlList = list()
        
    def GetUrlDownList(self):
        """
        获取url-list
        """
        self.__getObjectList()
        self.__getAnyUrl()
        return self.__UrlList
    def getKeyList(self):
        return self.__KeyList

    def __getObjectList(self):
        response = self.__client.list_objects(
            Bucket= self.__Bucket_appid
        )
        result = response['Contents']

        for i in result:
            self.__KeyList.append(i['Key'])
        
    def __getAnyUrl(self):
        count = 0
        for i in self.__KeyList:
            response = self.__client.get_presigned_download_url(
                Bucket=self.__Bucket_appid,
                Key=self.__KeyList[count],
                Expired=1000,
                Headers={
                    'Content-Length': '	video/mp4',
                },
                Params={
                    'param1': 'string',
                    'param2': 'string'
                }
            )
            self.__UrlList.append(response)
            count+=1
        
