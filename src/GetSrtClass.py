
import urllib
import json
import time
import re
from tencentcloud.common import credential
from tencentcloud.common.profile.client_profile import ClientProfile
from tencentcloud.common.profile.http_profile import HttpProfile
from tencentcloud.common.exception.tencent_cloud_sdk_exception import TencentCloudSDKException
from tencentcloud.asr.v20190614 import asr_client, models
import DownloadUrlGet


class GetSrt:

    def __init__(self,SecretId,SecretKey):
        """
        请先调用设置url 最后获取result
        """
        self.__SecretId = SecretId
        self.__SecretKey = SecretKey
        self.__url = ""
        self.__rowData = None
        self.__ResultData = None

    def simpleGetResultFile(self):
        """
        适合单url
        先设置url！！！！！！！！再运行！！！
        """
        try:
            client, resp = self.__getClientAndresp()
            self.__rowData = self.__getREsult(resp, client)
            self.__handlerData()
            self.__writeText()
        except TencentCloudSDKException as err:
            print(err)

    def GetKeyResultFile(self,urlList,keyList):
        """
        适合多url
        """
        for url,key in urlList,keyList:
            self.setUrl(url=url)
            client, resp = self.__getClientAndresp()
            self.__rowData = self.__getREsult(resp, client)
            self.__handlerData()
            self.__writeTextAndKeyName(KeyName=key)
            print(url+key)
        pass

    def setUrl(self,url):
            self.__url = url


    def __getClientAndresp(self):
        cred = credential.Credential(self.__SecretId,self.__SecretKey)
        httpProfile = HttpProfile()
        httpProfile.endpoint = "asr.tencentcloudapi.com"
        clientProfile = ClientProfile()
        clientProfile.httpProfile = httpProfile
        client = asr_client.AsrClient(cred, "", clientProfile)
        req = models.CreateRecTaskRequest()
        params = {
                "EngineModelType": "16k_zh_video",
                "ChannelNum": 1,
                "ResTextFormat": 0,
                "SourceType": 0,
                "Url": self.__url
            }
        req.from_json_string(json.dumps(params))
        resp = client.CreateRecTask(req)
        print(resp.to_json_string())
        return client,resp

    def __getREsult(self,resp, client):
        req1 = models.DescribeTaskStatusRequest()
        re = json.loads(json.dumps(resp.to_json_string()))
        fun = json.loads(re)
        print(fun)
        params1 = {
            "TaskId": fun['Data']['TaskId']
        }
        req1.from_json_string(json.dumps(params1))
        while(True):
            resp1 = client.DescribeTaskStatus(req1)
            result = json.loads(resp1.to_json_string())
            if(result['Data']['StatusStr'] == 'success'):
                break
            if(result['Data']['StatusStr'] == 'failed'):
                print(result)
                break
            time.sleep(5)
            print(result['Data']['StatusStr'])
        return result
    
    def __handlerData(self):
        result = self.__rowData['Data']['Result']
        txt = result.split('\n')
        txt = str(txt)

        print(txt)
        txt = txt.replace("\', \'", "\n\n")
        txt = re.sub("[,]", " --> ", txt)
        txt = txt.replace("[", "")
        txt = txt.replace("]", "")
        txt = "\n\n"+txt

        txt = self.__ChangeTxt(txt)

        self.__ResultData = txt
        

    def __ChangeTxt(self, txt):
        a = 0
        cou = txt.count("\n")/2
        b = str(a)
        while(True):
            b = str(a)
            txt = txt.replace("\n\n", "\n"+b+"\n", 1)
            if(cou < 0):
                print("End")
                txt = txt.replace("  ", "\n")
                break
            a += 1
            cou -= 1
        return txt

    def __writeText(self):
        Data = self.__ResultData
        Data = str(Data)
        a = time.time()
        a = str(int(a))
        with open(a+"result.srt", 'w', encoding='utf-8') as f:
            f.write(Data)
    
    def __writeTextAndKeyName(self,KeyName):
        Data = self.__ResultData
        Data = str(Data)
        with open(KeyName+"result.srt", 'w', encoding='utf-8') as f:
            f.write(Data)

if __name__ == "__main__":
    SecretId = "AKIDEGNH1WCy2sJeninrbasujGagV5RwLLMR"
    SecretKey = "jCTx8B5nQZT8sX1NXiVCm094kAJQOI3q"

    g1 = DownloadUrlGet.UrlGet(secret_id=SecretId,secret_key=SecretKey,region="ap-nanjing")

    g = GetSrt(SecretId=SecretId,SecretKey=SecretKey)
    g.GetKeyResultFile(urlList=g1.GetUrlDownList(),keyList=g1.getKeyList())
