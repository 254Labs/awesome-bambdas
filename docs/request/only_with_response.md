---
title: Only with Response
parent: Request Bambdas 
layout: default 
has_toc: false 
has_children: false 
---

```java
/*
  Author: Sajeeb Lohani (https://github.com/prodigysml/)
  Source: GitHub
  Init Pub. Date: Nov 02, 2023
  Use Case:
    Filter for requests with non-empty responses.
*/

if (!requestResponse.hasResponse()){
    return false;
}

return true;
```