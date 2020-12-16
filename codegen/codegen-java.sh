#!/bin/bash

set -ex

java -jar swagger-codegen-cli-3.0.23.jar \
  generate \
  -i http://localhost:8443/v3/api-docs/public \
  -l java -o java-resttemplate \
  --api-package com.katalon.testops.api \
  --model-package com.katalon.testops.model \
  --library resttemplate \
  --group-id com.katalon.testops \
  --artifact-id api \
  --artifact-version 1.0-SNAPSHOT \
  -u https://analytics.katalon.com \
  -DdateLibrary=Java8 -DhideGenerationTimestamp=true