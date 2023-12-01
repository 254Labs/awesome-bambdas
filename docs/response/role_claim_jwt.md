---
title: Role Claim in JWT
parent: Response Bambdas
layout: default # DO NOT CHANGE
has_toc: false # DO NOT CHANGE 
has_children: false # DO NOT CHANGE
---

```java
/*
  Author: PortSwigger (https://portswigger.net)
  Source:  PortSwigger Blog (https://portswigger.net/blog/introducing-bambdas)
  Init Pub. Date: Nov 14, 2023
  Use Case: 
    Filter for responses with a custom claim - role in a JWT token.
*/

var body = requestResponse.response().bodyToString().trim();

if (requestResponse.response().hasHeader("authorization")) {
    var authValue = requestResponse.response().headerValue("authorization");

    if (authValue.startsWith("Bearer ey")) {
        var tokens = authValue.split("\\.");

        if (tokens.length == 3) {
            var decodedClaims = utilities().base64Utils().decode(tokens[1], Base64DecodingOptions.URL).toString();

            return decodedClaims.toLowerCase().contains("role");
        }
    }
}

return false;

```