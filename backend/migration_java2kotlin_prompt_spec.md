# Migration Java → Kotlin: Prompt-Spezifikation für ein Spring Boot Modulith Backend

Diese Datei beschreibt die einzelnen Schritte als Prompt, nach denen die Migration eines bestehenden Java Spring Boot (mit Spring Modulith) Backends zu Kotlin durchgeführt werden soll. Ziel ist ein lauffähiger, idiomatischer Kotlin-Code mit Spring Boot und Spring Modulith.

---

## 1. Kotlin-Plugin und Abhängigkeiten hinzufügen

**Prompt:**
> Füge das Kotlin-Plugin sowie die notwendigen Kotlin-Abhängigkeiten (kotlin-stdlib, kotlin-reflect, kotlin-maven-plugin) zur `pom.xml` hinzu. Stelle sicher, dass die Versionen kompatibel mit dem verwendeten Spring Boot sind. 

## 2. Kotlin-Source-Ordner anlegen

**Prompt:**
> Lege die Verzeichnisse `src/main/kotlin` und `src/test/kotlin` an. Stelle sicher, dass diese als Source-Ordner im Build und in der IDE erkannt werden.

## 3. Schrittweise Migration der Java-Klassen nach Kotlin

**Prompt:**
> Migriere die Java-Klassen einzeln nach Kotlin. Beginne mit einfachen Klassen (DTOs, Models), dann Services, Repositories, Controller. Nutze die automatische Konvertierung der IDE, passe die resultierenden Kotlin-Klassen an Kotlin-Idiome an (data classes, null safety, default parameter, etc.). Nach jeder Migrationseinheit: Kompiliere und teste das Projekt.

## 4. Spring-spezifische Anpassungen

**Prompt:**
> Achte auf Spring-spezifische Besonderheiten in Kotlin (offene Klassen, keine final-Klassen, Nullability). Nutze das Plugin `all-open` für Spring, damit Spring-Beans nicht final sind. Prüfe, ob alle Spring-Annotationen korrekt übernommen wurden.

## 5. Tests und Build

**Prompt:**
> Stelle sicher, dass alle Tests weiterhin laufen. Passe ggf. Testklassen auf Kotlin an. Baue das Projekt regelmäßig und behebe auftretende Fehler sofort.

## 6. Aufräumen

**Prompt:**
> Entferne nach und nach die alten Java-Dateien, sobald sie migriert sind. Entferne Java-spezifische Abhängigkeiten, falls nicht mehr benötigt.

## 7. Optional: Kotlin-Features nutzen

**Prompt:**
> Nutze nach der Migration gezielt Kotlin-Features (Coroutines, Extension Functions, etc.), um den Code weiter zu verbessern.

---

**Hinweis:**
Nach jedem Schritt sollte das Projekt baubar und lauffähig sein. Die Migration erfolgt iterativ und testgetrieben. 