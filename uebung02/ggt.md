# Informatik I, Übung 02, Aufgabe 2
Markdown und AsciiMath

## Größter gemeinsamer Teiler (ggT)

### Das ggT-Problem

**Gegeben.** Zwei positive ganze Zahlen mit $a, b \in \mathbb{Z}$ mit $a, b > 0$                                                                                                                                                             .

**Gesucht.** Eine positive ganze Zahl $d \in \mathbb{Z}$ mit $d > 0$ und folgend                                                                                                                                                             en Eigenschaften.

* $d$ teilt $a$ und $b$ ohne Rest
* es gibt keine ganze Zahl $d' \in \mathbb{Z}$ mit $d'> d$, die $a$ und $b$ ohne                                                                                                                                                              Rest teilt

## Der Euklidischer Algorithmus (klassisch)

**Eingabe.** zwei ganze Zahlen $a, b$ mit $a > b \leq 0$

**Intialisierung.** $x \leftarrow a, y \leftarrow b$

**Iteration.** wiederhole das Folgende solange $y \neq 0$ gilt

* falls (x > y) dann $x \leftarrow a, y \leftarrow b$
* sonst $y \leftarrow y - x$

**Abschluss.** $d \leftarrow x$

**Rückgabe.** $d$

*Hinweis*. $A \leftarrow B$ steht für: speichere aktuellen Wert von $B$ in $A$.

## Euklidischer Algorithmus in Java
        // Eklidischer Algorithmus (klassisch)
        // Eingabe von a und b
        // Intialisierung
        int x = a;
        int y = b;
        // Iteration
        while(y != 0) { // '!=' steht fuer 'ungleich'
           if (x > y)
                x = x - y;
           else
                y = y - x;
        }
        // Abschluss
        int d = x;
        // Rückgabe von d
