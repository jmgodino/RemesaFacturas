openssl req -x509 -sha256 -nodes -days 365 -newkey rsa:2048 -keyout privateKey.key -out certificate.crt

openssl pkcs12 -export -out keyStoreTest.pfx -inkey privateKey.key -in certificate.crt

keytool -keystore trustStoreTest.pfx -storeType PKCS12 -alias testcrt -import -file certificate.crt

