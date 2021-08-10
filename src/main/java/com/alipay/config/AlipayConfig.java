package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016091900544545";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQChknPVOUc0syRVv4cGux18Hf9NSydspvs8enuLFl+PHjUM+KlyDvfCdTh6W3dREtx/GdzQ/1YCrISS6walSfdvaznkxEBHvdug6Vvcg7Kx2iwXki3NRPET661GnxLNGyWLYKT3hZlZFWmhlOy496WdvVNi5CfuUGPwt9MAmKYNCUNV2HyB0Toyiu180Ktyncnsft+zcZ2W9YPYVQOObDGcdIZEKySeQosDx2XIQWKM1RLBkp7z5q8Z6sdBz68h3u6Yv9qW1Nsh7yR1pp5rGt6UCnYzbBMc14l+4kMEJDmXV/PGYZprvE2JL81hvOBXOlAa5lf+KA80iMOXY8RSJTXDAgMBAAECggEAG+NbewJX+BCzxNk6RT8m57WFy6GdPHPWCapaiLdj5yAfqA2DsdxDh50UEoqXHbdTt9yO8MQh5HRCrdlDXGRYATNQ2tvE/J0Yu72LzZQt0+UEl0zz+upbckTLs9ThOeXlpRkZYF//CBFaGjnKYmLcg02ahwc6nTfjCDmygffXMYiQAPzNGyPkLuc7S+9hJmtxr+NTJ+ELn2t4tkKn9XCwuy42dgjKdXfjkyJC049qYuiaGQRdVTTsYiQd6bqhElTfkFU1ghJeodgintW3zfWzKKU+S1VoecsM7ut+xxNk9xMftkzuElYWpp9XRFmnpKXRpDoXXaw2RX3rasI3SeEhAQKBgQD7EjjDS5pa8o4LNN1ZixqjNrcF7g9gH0Y5aIEM5COK22HKvANMaYGXp6xEsW42J8mDHcfHOvZd4oZXjA1oYtN4ZMqQvRBY4LjoEMsPspVLKGWXeFr4Mutv7wZvDPwLK4Ob0ZsqACcc0hZJ2mR401DFhDE2qOJvWhegKtkMDlZWWwKBgQCkvnIkkuM+atGQYFTJ/PPw3SKqzrP+c+c7MJEEPdJ4Izlwe3/Sc7RvTvBEcUwouJ8ANtZJM//Z7YOTPm/WNDp9sGkGsthoc2PCNfV6XD6Ui1Fud/7qDJp6A+ZhfFuwLQEW7Zv5q5RDQaVUX36DzAa6hQ/A1y65KUiQN7rU9WfKuQKBgAeT4zaxv3TjQTpBXDTpp+IpMpjxOHGUQBBXgR2cfR4hxO/TgN37iTfEjcR8/nCP/tsAORlgRDNNNPTLe1QdN3i4wgxgSHAGSE5ow1gz8aGVFIvfzA8Vqll0g2MypyDHLW+0gdRgsM2D4bxU5RdoeVWcycd2jW8C7xecc3STsjNlAoGAThwiAGdIqVJ6NCsIaJCvlJc0lanVu6J2kyDO0SUCwoVo+YUEsOK9PT0/PCQ/yNroQHC/nwuxlkE/7jNfUT+IMAnRciSf6L41IWL2FeLgpQt9O5RXX99D6vAobjZJPrnH13gnSPRqIo1gdyWj1ZeJ5SursXIVLCN/zSkvQ0Nrx7kCgYEApmzot44pWNu5/c07R93Eh9bUGH1if8VzL7FHe04pzlsh40YtJZEE6pnSj1IfwcY4q8Ea2N3btxIrM3+4QjlEdpAHWwHk/m5cIjiKcTyvRBe0kTHWSkjDK4nxCYum4n8R2UuiUpU94P/+UrY2yFsX4GpYDX7I32LglW9eMA3e7ns=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAy6PzF584D+7TKyr9uFdhs7evViZ+VBYp5ELkQj4Wj5L5g+vHpvN7z+pTra7/Rjyx9RcoTVhfPpCsoDKrFrafa93XajAJ+kjSxfrth+joloXeTy1Jgy8+r5ipYLK/4mw1OvKaJ6dXHaWjFQutSnGFo5zALvdF69cb2o47RiqSOQmK8hhnKBzV26aqmSS9XWFKixuh9V6UmmeggIAJD/YNp/E6pGu76rdELLAWZJlywKOnhtY/6y1Tia7T5ehL0Wbe0SKcItYgoBFLxDM0ie1JRcVHHrr6D0Rz4yZN/M6Ok0qWJt2d5ncYf5pMHiJL/VvVSvxGgWBKC+9NFDZkoPs3zQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://127.0.0.1:9100/demo-alipay/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://127.0.0.1:9100/demo-alipay/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

