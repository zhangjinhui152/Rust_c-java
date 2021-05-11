import json
import time
import re
from tencentcloud.common import credential
from tencentcloud.common.profile.client_profile import ClientProfile
from tencentcloud.common.profile.http_profile import HttpProfile
from tencentcloud.common.exception.tencent_cloud_sdk_exception import TencentCloudSDKException
from tencentcloud.asr.v20190614 import asr_client, models


SecretId = "AKIDEGNH1WCy2sJeninrbasujGagV5RwLLMR"
SecretKey = "jCTx8B5nQZT8sX1NXiVCm094kAJQOI3q"
url="https://1earning-1305041181.cos.ap-nanjing.myqcloud.com/%E5%B0%9A%E7%A1%85%E8%B0%B7%E5%B0%9A%E7%AD%B9%E7%BD%91Java%E9%A1%B9%E7%9B%AE%E5%AE%9E%E6%88%98%E5%BC%80%E5%8F%91%E6%95%99%E7%A8%8B(%E5%90%ABSSM%E6%A1%86%E6%9E%B6%2C%E5%BE%AE%E6%9C%8D%E5%8A%A1%E6%9E%B6%E6%9E%84%2C%E5%B0%81%E6%8D%B7%E4%B8%BB%E8%AE%B2)%20-%20109.109.%E5%B0%9A%E7%A1%85%E8%B0%B7_%E8%A7%92%E8%89%B2%E7%BB%B4%E6%8A%A4-%E5%88%86%E9%A1%B5-%E5%90%8E%E7%AB%AF-RoleMapper(Av95017741%2CP109).mp4?q-sign-algorithm=sha1&q-ak=AKIDxgajuqR8UnXUZN4taMeW1VfgiO1qPimAOUAjCY5lI6Q8b_pD1f2oLYmrAQI6BC96&q-sign-time=1620713135;1620716735&q-key-time=1620713135;1620716735&q-header-list=&q-url-param-list=&q-signature=a3f2d47ef80f6924be6c3af221a4341b78962c71&x-cos-security-token=gFRDp51A4EzgvxRNGaYqgB5iOUUljjea9771647610113c64825870e8b0e37c9fd6CsARe0zouq7LTTQQ1HXCqDnww0CcBVMqCapfs4XCC1m_4dyDFxwHVnp3pkKHstpBGm6AKaDwmOOd5BDfH2MNY91Ehm5u6QXn9drmgo8sa1UZufKps6BxE4nCJoQJ3J3TOyxYYuQrtQ0WQyrrjKSD7x70uuI2DbWVgtuHcjKog&response-content-type=application%2Foctet-stream&response-content-disposition=attachment"


def getREsult(resp,client):
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
        if(result['Data']['StatusStr']=='success'):
            break
        if(result['Data']['StatusStr']=='failed'):
            print(result)
            break
        time.sleep(5)
        print(result['Data']['StatusStr'])
    return result

def GO():
    try: 
        
        cred = credential.Credential(SecretId, SecretKey) 
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
            "Url":url
        }
        
        req.from_json_string(json.dumps(params))
        
        resp = client.CreateRecTask(req)
        print(resp.to_json_string()) 
        return getREsult(resp,client)


    except TencentCloudSDKException as err: 
        print(err) 

def writeText(Data):
    Data = str(Data)
    with open('a.txt','w',encoding = 'utf-8') as f:
        f.write(Data)
    pass

def handlerData(Data):
    result = Data['Data']['Result']
    txt = result.split('\n')
    txt = str(txt)
    
    print(txt)
    txt = txt.replace("\', \'","\r\n")
    txt = re.sub("[,]", " --> ", txt)
    txt = txt.replace("[","")
    txt = txt.replace("]","")
    writeText(txt)
    




if __name__ == '__main__':
    result = GO()
    print(result)
    handlerData(result)
    print("succeed")
