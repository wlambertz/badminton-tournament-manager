# AGENT.md (Angular Frontend)

## Zweck
Standards für Agent-Aufgaben im Frontend (`frontend`, Angular, npm).

## Umgebung & Tools
- Node LTS
- npm (Lockfile vorhanden)

## Policies
- Nur stabile Paketversionen (keine rc/alpha/beta)
- Lockfile muss konsistent bleiben (`package-lock.json`)

## Typische Aufgaben (Playbooks)
- Dependencies aktualisieren
  - `npm ci`
  - `npm outdated` / selektiv `npm install <pkg>@latest`
- Qualitätssicherung
  - `npm run lint`
  - `npm test` (falls konfiguriert)
  - `npm run build`

## Artefakte
- Keine Commits von `node_modules/`, `dist/`, `.angular/cache`

## Branching/Merge
- Branch: `chore/frontend-deps-YYYYMMDD` (oder passend)
- PR gegen `main`, Squash Merge bevorzugt
