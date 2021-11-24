# scala-web-millbuild-spring-jsp-secure-rsa-encrypt-scrypt-encode

## Description
A springboot secure web app with jsp support.
Three roles are defined; USER, ADMIN, and SUPER. All roles
can access pages `/home`, `/login`, and `/about`. Only USER
can access `/user` and ADMIN only `/admin` whereas SUPER can
navigate to either and have its own `/super`. Each role
has an action USER=VIEW ONLY, ADMIN=READ/WRITE, SUPER=CREATE.
All password are RSA encrypted and encoded with scrypt.

## Tech stack
- scala
- millbuild

## Docker stack
- nightscape/scala-mill

## To run
`sudo ./install.sh -u`
Available at http://localhost
- Login with id: user and password: pass
- Login with id: admin and password: pass
- Login with id: super and password: pass

## To stop (optional)
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credits
- https://hellokoding.com/spring-security-login-logout-jsp/
- https://www.javainterviewpoint.com/spring-security-inmemoryuserdetailsmanager/
