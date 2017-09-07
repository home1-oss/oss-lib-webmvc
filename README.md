[![Build Status](https://travis-ci.org/home1-oss/oss-lib-webmvc.svg?branch=master)](https://travis-ci.org/home1-oss/oss-lib-webmvc)

-----
There are link issues on git service generated pages, see gitbook or maven site.
+ [gitbook](https://home1-oss.github.io/home1-oss-gitbook/release/docs/oss-lib-webmvc/)
+ [maven site](https://home1-oss.github.io/home1-oss/release/oss-lib-webmvc/index.html)
-----

# oss-lib-webmvc
Webmvc components for spring-boot based web projects.

Provide custom config and utils for `spring-webmvc`.

This library is mainly do serialization / deserialization configuration for spring-webmvc applications.

In our micro-service environment, the various services mainly communicate through the RESTful-style HTTP interface.
If each service is not exactly the same as the serialization and deserialization of the data, it can cause a disaster.

If the user requires custom serialization / deserialization when calling a third-party API, 
configure it separately on a dedicated client and do not corrupt the global settings.

## References

[Pretty Print JSON Per Request With Spring MVC](https://dzone.com/articles/bozhos-tech-blog)
