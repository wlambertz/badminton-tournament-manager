# AGENT.md (Spring Boot Backend)

## Zweck
Standards für Agent-Aufgaben im Backend (`backend`, Kotlin/Spring Boot, Gradle).

## Umgebung & Tools
- Java gemäß Gradle-Wrapper-Konfiguration
- Gradle Wrapper (`gradlew`/`gradlew.bat`)

## Policies
- Nur stabile Bibliotheksversionen (keine rc/alpha/beta)
- Keine Direkt-Pushes auf `main`

## Typische Aufgaben (Playbooks)
- Dependencies aktualisieren
  - Vorzugsweise über Versionskatalog/Plugins
  - Tests sicherstellen
- Qualitätssicherung
  - `./gradlew clean build`
  - `./gradlew test`
- Lokaler Start
  - `./gradlew bootRun`

## Artefakte
- Keine Commits von `.gradle/`, `build/`, `target/`

## Branching/Merge
- Branch: `chore/backend-deps-YYYYMMDD` (oder passend)
- PR gegen `main`, Squash Merge bevorzugt
