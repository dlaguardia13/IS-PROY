# IS-PROY

Comandos para gcloud SDK

docker login 
---> (Pasos para la autentificación)
docker pull google/cloud-sdk:alpine
docker run google/cloud-sdk:alpine gcloud version
docker run -ti --name gcloud-config google/cloud-sdk:alpine gcloud auth login
---> (Pasos para la autentificación)
docker run --rm --volumes-from gcloud-config1 google/cloud-sdk:alpine gcloud compute instances list --project  IDProject

Comandos Docker

docker login 
docker build -t user/name .
docker run -d -p 9090:9090 imageName

Comandos Kubernetes

Kubectl create deploment nombre --image=nombreImagen
Kubectl get pods
Kubectl expose deployment nombrePod --port=9090
Kubectl get service

RECOMENDACIONES

  Curso Docker

https://www.youtube.com/playlist?list=PLwH0tlWs8nkTQ8lNQ1usKML8pxAP4hEMH
