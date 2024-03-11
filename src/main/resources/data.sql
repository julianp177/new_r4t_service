INSERT INTO USERS (USER_NAME,passwort,vorname,nachname,email,role)
VALUES ('peterjuls','schnitzel','Julian','Peters','julian.peters@r4t.com','requirements_engineer');
INSERT INTO USERS (USER_NAME,passwort,vorname,nachname,email,role)
VALUES ('schneemile','schnitzel','Emile','Schneider','emile.schneider@r4t.com','test_manager');
INSERT INTO USERS (USER_NAME,passwort,vorname,nachname,email,role)
VALUES ('wabian','schnitzel','Fabian','Wolf','fabian.wolf@r4t.com','testcase_creator');
INSERT INTO USERS (USER_NAME,passwort,vorname,nachname,email,role)
VALUES ('huettp','schnitzel','Pascal','Hüttel','pascal.huettel@r4t.com','tester');
INSERT INTO USERS (USER_NAME,passwort,vorname,nachname,email,role)
VALUES ('fabizubi','schnitzel','Fabian','Kuklik','fabian.kuklik@r4t.com','tester');

INSERT INTO REQUIREMENT (bezeichnung,beschreibung)
VALUES ('Funktionale Eigenschaften','Funktionale Eigenschaften beziehen sich auf die spezifischen Verhaltensweisen und Funktionalitäten eines Systems oder einer Software.
Diese Eigenschaften beschreiben, was das System tun soll, wie es auf Eingaben reagiert und welche Ergebnisse es liefert.
Beispiele für funktionale Eigenschaften sind die Benutzeranmeldung, die Verarbeitung von Bestellungen oder die Berechnung von Daten.');
INSERT INTO REQUIREMENT (bezeichnung,beschreibung)
VALUES ('Nicht-funktionale Eigenschaften','Nicht-funktionale Eigenschaften beschreiben Aspekte einer Software oder eines Systems, die nicht direkt mit den Funktionalitäten zusammenhängen, sondern die Qualität, Leistung und Benutzererfahrung beeinflussen.
Beispiele für nicht-funktionale Eigenschaften sind die Performance, Sicherheit und Benutzerfreundlichkeit einer Anwendung.
Diese Eigenschaften sind oft ebenso wichtig wie die funktionalen Anforderungen, da sie darüber entscheiden, wie effizient und zuverlässig das System arbeitet und wie zufriedenstellend es für die Benutzer ist.');
INSERT INTO REQUIREMENT (bezeichnung,beschreibung)
VALUES ('Benutzerrichtlinien','Benutzerrichtlinien sind schriftliche Dokumente, die die erwarteten Verhaltensweisen und Regeln für die Nutzung eines Systems oder einer Anwendung definieren.
Sie dienen dazu, klare Anweisungen für die Benutzer bereitzustellen, um ein konsistentes und sicheres Nutzungserlebnis zu gewährleisten.
Diese Richtlinien können Aspekte wie Datenschutz, Sicherheit, Zugriffsrechte und Verantwortlichkeiten abdecken und helfen, Missverständnisse zu vermeiden und den reibungslosen Betrieb des Systems zu unterstützen.');
INSERT INTO REQUIREMENT (bezeichnung,beschreibung)
VALUES ('Systemvoraussetzungen','Systemvoraussetzungen beschreiben die minimalen technischen Spezifikationen, die ein System erfüllen muss, um eine bestimmte Software oder Anwendung ausführen zu können.
Dazu gehören typischerweise Hardwareanforderungen wie Prozessorgeschwindigkeit, Arbeitsspeicher und Festplattenspeicher, sowie Softwarevoraussetzungen wie das Betriebssystem und die erforderlichen Softwareversionen.
Die Kenntnis der Systemvoraussetzungen ist wichtig, um sicherzustellen, dass das System ordnungsgemäß funktioniert und eine optimale Leistung erzielt wird.');
INSERT INTO REQUIREMENT (bezeichnung,beschreibung)
VALUES ('Gesetze und Regularien','Gesetze und Regularien sind rechtliche Rahmenbedingungen, die Unternehmen und Organisationen einhalten müssen, um gesetzeskonform zu handeln.
Diese Vorschriften können sich auf verschiedene Bereiche wie Datenschutz, Sicherheit, Umweltschutz oder Arbeitssicherheit beziehen und variieren je nach Branche und Standort.
Die Einhaltung von Gesetzen und Regularien ist entscheidend, um rechtliche Risiken zu minimieren, das Vertrauen der Kunden zu wahren und mögliche Strafen oder Sanktionen zu vermeiden.');

INSERT INTO TESTRUN (bezeichnung,requirement_ID)
VALUES ('Anmeldung und Abmeldung',1);
INSERT INTO TESTRUN (bezeichnung,requirement_ID)
VALUES ('Neues Konto erstellen',1);
INSERT INTO TESTRUN (bezeichnung,requirement_ID,user_ID)
VALUES ('Bestellungen speichern',1,4);
INSERT INTO TESTRUN (bezeichnung,requirement_ID)
VALUES ('Administrator Seite',1);
INSERT INTO TESTRUN (bezeichnung,requirement_ID,user_ID)
VALUES ('Benutzerinteraktionen',2,2);
INSERT INTO TESTRUN (bezeichnung,requirement_ID,user_ID)
VALUES ('Benutzeroberfläche',2,2);
INSERT INTO TESTRUN (bezeichnung,requirement_ID)
VALUES ('Verschlüsselung',2);
INSERT INTO TESTRUN (bezeichnung,requirement_ID)
VALUES ('Skalierbarkeit',2);
INSERT INTO TESTRUN (bezeichnung,requirement_ID,user_ID)
VALUES ('Intuitive Navigation',3,4);
INSERT INTO TESTRUN (bezeichnung,requirement_ID)
VALUES ('Modulare Architektur',4);
INSERT INTO TESTRUN (bezeichnung,requirement_ID,user_ID)
VALUES ('Externe Systeme',4,1);
INSERT INTO TESTRUN (bezeichnung,requirement_ID)
VALUES ('Hohe Verfügbarkeit',4);
INSERT INTO TESTRUN (bezeichnung,requirement_ID)
VALUES ('Filterfunktion',3);
INSERT INTO TESTRUN (bezeichnung,requirement_ID)
VALUES ('Bestellungsänderungen',3);
INSERT INTO TESTRUN (bezeichnung,requirement_ID,user_ID)
VALUES ('Benachrichtigungen',3,2);
INSERT INTO TESTRUN (bezeichnung,requirement_ID,user_ID)
VALUES ('Datenschutzgesetze',5,1);
INSERT INTO TESTRUN (bezeichnung,requirement_ID)
VALUES ('DSGVO',5);
INSERT INTO TESTRUN (bezeichnung,requirement_ID)
VALUES ('Branchenspezifische Vorschriften',5);
INSERT INTO TESTRUN (bezeichnung,requirement_ID)
VALUES ('Plattformübergreifende Funktionalität',4);

INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Anmeldefunktion',1,1);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Abmeldefunktion 1',1,1);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Nutzername-Check',2,1);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Passwortrichtlinien-Check',2,1);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Hinzufügen in Datenbank',2,1);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Formular erstellen',3,1);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('SQL-Funktion erstellen',3,1);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Beispieldaten anlegen',3,1);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Framework aufsetzen',4,1);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Admin-Nutzer auswählen',4,1);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Export Funktion',null,1);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Send-Formular',5,2);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Get-Formular',5,2);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Anstupsen Funktion',5,2);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Responsives Verhalten',6,2);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Theme Individualisierung',6,2);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Passwort Hash',7,2);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Usability Test',9,3);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Barrierfreiheit',9,3);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('SQL Abfragen',13,3);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Datenbank Verbindung',14,3);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Kundenkontaktformular',14,3);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Push Mitteilungen für App',15,3);
INSERT INTO TESTCASE (bezeichnung,testrun_ID,requirement_ID)
VALUES ('Formularerstellen',3,1);
