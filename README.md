# Spring Boot Blog Application

This is an ENTIRE application for Java Spring Boot using:
- Spring Data JPA
- H2 Database
- Thymeleaf
- Spring Security
- Model View Controller (MVC) architecture

**I walk through how to build this yourself on YouTube**: https://youtu.be/7iWlCl35p9o

## Development Instructions

- `git clone https://github.com/wazooinc/spring-boot-blog-application.git`
- `cd spring-boot-blog-application`
- open in favorite editor, or
- `mvnw spring-boot:run`
- open http://localhost:3000 and Blog away!

## Built-in Account and Constraints

- Login as a User with `user.user@domain.com` and password `password`
- Login as an Admin with `admin.admin@domain.com` and password `password`
- An **Anonymous** account can only `READ` Posts
- A **User** account can `CREATE, READ, UPDATE` Posts
- An **Admin** account can `CREATE, READ, UPDATE, DELETE` Posts

## LICENSE

MIT License

Copyright (c) 2022 Wazoo Enterprises Inc.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
