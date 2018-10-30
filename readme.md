---
Grails 3.3.8 forge

rest-api + security

---
grails> create-domain-resource  postcode

grails> s2-quickstart User Role

Boottrap => add some data


---

[pattern: '/api/**',         filters: 'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter,-rememberMeAuthenticationFilter']

---
grails.plugin.springsecurity.rest.token.storage.jwt.secret	= 'qrD6h8K6S9503Q06Y6Rfk21TErImPYqa'

---
curl -i -H "Content-Type: application/json" --data '{"username":"user","password":"pass"}' 0:8080/api/login

---
$ curl -i -H "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9...." 0:8080/api/postcode