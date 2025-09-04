# AGENT.md (Flutter App)

## Zweck
Standards für Agent-Aufgaben im Flutter-Teilprojekt `app`.

## Umgebung & Tools
- Flutter stable channel
- Dart SDK in Flutter gebündelt

## Policies
- Nur stabile Paketversionen (keine rc/alpha/beta)
- Keine Commits von generierten/ephemeral Dateien

## Typische Aufgaben (Playbooks)
- Dependencies aktualisieren
  - `flutter pub upgrade`
  - Bei Bedarf: selektive Upgrades in `pubspec.yaml`
- Qualitätssicherung
  - `flutter pub get`
  - `flutter analyze`
  - `flutter test`
- Build
  - `flutter build apk` (Android) bzw. passende Plattform-Builds

## Artefakte
- Keine Commits von `.dart_tool/`, `build/`, Plattform-ephemerals

## Branching/Merge
- Branch: `chore/app-deps-YYYYMMDD` (oder passend zum Task)
- PR gegen `main`, Squash Merge bevorzugt
