# Local Setup

This document will walk you through the dependencies of this service and how to set it up locally

- To setup the ID Generation Service (egov-idgen) in your local system, clone the [Core Service Repository](https://github.com/upyog/UPYOG/tree/master/core-services).

## Dependencies

### Infra Dependency

- [X] Postgres DB
- [ ] Redis
- [ ] Elasticsearch
- [ ] Kafka
  - [ ] Consumer
  - [ ] Producer

## Running Locally

To run the ID Generation services in your local system, you need to port forward below services

```bash
function kgpt(){kubectl get pods -n egov --selector=app=$1 --no-headers=true | head -n1 | awk '{print $1}'}
kubectl port-forward -n egov $(kgpt egov-mdms-service) 8088:8080
``` 

To run the notification mail services locally, update below listed properties in `application.properties` before running the project:

```ini
# The host of the running environment (eg:https://localhost:8088/citizen)
mdms.service.host=http://127.0.0.1:8088/

# MDMS service URI. i.e egov-mdms-service/v1/_search
mdms.service.search.uri=
```

