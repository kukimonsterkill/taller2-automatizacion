# Proyecto de Automatización y Pruebas - Validador de Usuarios

En este proyecto se implementa un flujo completo de **Integración Continua (CI)**, **Pruebas Unitarias**, **BDD** y **Diseño de Performance** para el módulo `ValidadorUsuario`.

##  Estructura del Proyecto
- `src/main/java/com.iplacex.servicio/ValidadorUsuario.java`: Lógica de validación de credenciales.
- `src/test/java/com.iplacex.servicio/ValidadorUsuarioTest.java`: Pruebas unitarias atómicas con JUnit 5.
- `src/test/java/com.iplacex.servicio/ValidadorUsuarioSteps.java`: Implementación de pasos BDD (Cucumber).
- `src/test/resources/features/validador.feature`: Escenarios de prueba redactados en Gherkin.
- `.github/workflows/ci.yml`: Pipeline de CI para compilación y ejecución de pruebas en cada `push`.

##  Comandos de Ejecución
- **Ejecutar Pruebas Unitarias:** `mvn test`
- **Generar Reporte HTML Navegable:** `mvn surefire-report:report` (Ubicación: `target/site/surefire-report.html`)

##  Métricas de Performance y Monitoreo
- **TPS:** Capacidad esperada de 300 req/s.
- **Latencia (p95):** Respuesta máxima < 200 ms.
- **Tasa de Errores:** Menor al 0.1%.
- **Alertas:** Notificación vía Webhook a Slack/Correo ante fallos en la fase de `mvn test` o superación de umbrales SLO.