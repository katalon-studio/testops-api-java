#!/bin/bash

set -ex

java -jar openapi-generator-cli-5.0.0-beta3.jar \
  generate \
  -i http://localhost:8443/v3/api-docs/public \
  -g java \
   -c ./java-config.yaml