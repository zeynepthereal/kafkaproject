# Kafka Projesi

Bu projede Apache Kafka üzerinden Producer ve Consumer mesajları üretilmiştir.

Docker üzerinde imaj oluşturuldu.

 Kafka Docker Container'da çalıştırıldı. Producer ve Consumer haberleşmesi sağlandı. 
 
 Postman üzerinden kontrol sağlandı.
 
 # Nasıl çalışır?
 
 Terminale # docker-compose up yazılır.
 
 Docker up edildikten sonra Curl ile post işleminden gelen cevap ile test edilmiş olur.
 
 
 ```
 PS C:\Users\Zeynep\Desktop\kafpack> docker push zeynepesen/kafpack:1.0
The push refers to repository [docker.io/zeynepesen/kafpack]
c6c7865515ce: Pushed
1a7b75ac9b74: Pushed
f64df31005fa: Mounted from zeynepesen/kafkaconfiguration
4935b8115970: Mounted from zeynepesen/kafkaconfiguration
8d3ac3489996: Mounted from zeynepesen/kafkaconfiguration
1.0: digest: sha256:1c766e505a82db20be00c6bc2fbddadd369e2c2025a9bc5c20dc85e889d220b8 size: 1370

 ```
  ```
 
 kafpack-kafpack-1    | Message received by consumer:Message(description=test)
 
  ```
