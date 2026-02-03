# MyWebAssignment - Java Servlet Project

## Project Structure
```
MyWebAssignment/
├─ src/
│   ├─ LoginServlet.java
│   └─ RedirectServlet.java
├─ WebContent/
│   ├─ login.html
│   ├─ redirect.html
│   └─ WEB-INF/
│       └─ web.xml
```

## Deployment Instructions

### Option 1: Using Eclipse IDE
1. Import this project into Eclipse
2. Right-click project → Properties → Project Facets
3. Enable "Java" and "Dynamic Web Module"
4. Add Tomcat server to Eclipse
5. Right-click project → Run As → Run on Server

### Option 2: Manual Deployment to Tomcat
1. Compile Java files:
   ```
   javac -cp "path/to/tomcat/lib/servlet-api.jar" src/*.java
   ```
2. Create WAR structure:
   - Copy WebContent/ to MyWebAssignment/
   - Create WEB-INF/classes/ directory
   - Move compiled .class files to WEB-INF/classes/
3. Deploy to Tomcat webapps directory

### Option 3: Using Maven (create pom.xml)
1. Add Maven structure
2. Run: `mvn clean package`
3. Deploy generated WAR file

## Login Credentials
- Username: admin
- Password: password

## Access URLs
- http://localhost:8080/MyWebAssignment/ (redirects to login)
- http://localhost:8080/MyWebAssignment/login
- http://localhost:8080/MyWebAssignment/redirect (after successful login)