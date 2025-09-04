# AGENT.md

## Zweck
Repo-weite Leitplanken für Automations-/AI-Agenten in diesem Monorepo (`app` Flutter, `backend` Spring Boot, `frontend` Angular).

## Ziele
- Wiederholbare, sichere Automationen (z. B. Dependency-Updates, CI-Hilfsaufgaben)
- Einheitliche Policies und Workflows über alle Subprojekte

## Nichtziele
- Keine Infrastruktur-/Cloud-Änderungen ohne explizite Freigabe
- Keine Breaking Changes ohne Ticket und Review

## Berechtigungen
- Schreiben auf Feature-Branches, PRs gegen `main`
- Kein Direkt-Push auf `main`

## Policies
- Versionen: nur stabile Releases (keine rc/alpha/beta)
- Merge: Squash Merge bevorzugt
- Branching: `docs/*`, `chore/*`, `feat/*`, `fix/*`
- Commits: konventionelle Commits

## Qualitäts- und CI-Gates
- Lint und Build müssen in allen Subprojekten grün sein
- Tests müssen bestehen
- CI-Gates müssen passieren

## Standard-Playbooks
- Dependency-Update (Repo-weit)
  1. Branch `chore/updates-YYYYMMDD` erstellen
  2. Subprojekt-Playbooks in `app/AGENT.md`, `backend/AGENT.md`, `frontend/AGENT.md` ausführen
  3. Lint/Build/Test in allen Subprojekten
  4. PR gegen `main` mit Changelog

## Rollback
- Merge-Commit revertieren
- Lockfiles auf letzten grünen Stand zurücksetzen

## Kontakt
- Maintainer: Repo-Owner
- Kanal: PR-Kommentare
