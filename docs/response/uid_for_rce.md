---
title: UID for RCE
parent: Response Bambdas
layout: default # DO NOT CHANGE
has_toc: false # DO NOT CHANGE 
has_children: false # DO NOT CHANGE
---

```java
/*
  Author: Miguel J. Carmona (https://x.com/mibaltoalexTolgaDemirayak)
  Source:  X/Twitter (https://x.com//mibaltoalex/status/1728066917875732957/)
  Init Pub. Date: Nov 24, 2023
  Use Case: 
    Filter for JSON responses that contain uid key/property to probe for RCE vulnerability.
*/

if(requestResponse.mimeType().equals(MimeType.JSON)) {
  return this.utilities().htmlUtils().decode(requestResponse.response().bodyToString()).contains("uid");
}

return true;

```