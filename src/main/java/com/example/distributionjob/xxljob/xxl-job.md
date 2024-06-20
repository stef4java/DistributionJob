# https://www.xuxueli.com/xxl-job/
```shell
docker run -e PARAMS="--spring.datasource.url=jdbc:mysql://127.0.0.1:3306/xxl_job?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&serverTimezone=Asia/Shanghai" -p 8080:8080 -v /tmp:/data/applogs --name xxl-job-admin  -d xuxueli/xxl-job-admin:{指定版本}
```
```shell
docker run  -e PARAMS="--spring.datasource.url=jdbc:mysql://local.mysql.com:3306/xxl_job?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&serverTimezone=Asia/Shanghai --spring.datasource.username=root --spring.datasource.password=root123456" -p 8080:8080 -v /tmp:/data/applogs --name xxl-job-admin  -d xuxueli/xxl-job-admin:2.4.1
```
# issues
https://github.com/xuxueli/xxl-job/issues/195


# 以交互方式进入容器
sudo docker exec -it 775c7c9ee1e1 /bin/bash
# 容器内
apt-get update && apt install -y net-tools iputils-ping
# 容器外
docker exec -it 容器名称/id apt install -y net-tools iputils-ping
