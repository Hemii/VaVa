# VaVa
Projekt na predmet Vývoj aplikácií s viacvrstvou architektúrou

**ZADANIE** <br>
Vývoj aplikácie pre zapisovanie výsledkov súťaže Trial RC modelov. 
Priebeh sútaže sa nezaobíde bez týchto úkonov:
Na začiatku je potrebné vytvoriť PRETEK sútaž, kde musíme navoliť koľko TRATÍ bude potrebné zadať (minimu 3 maximum 7). 
Ako náhle je vytvorený PRETEK, tak potrebujeme prihlásiť JAZDCOv. Jazdci, ktorý už boli predtým na PRETEKU, si vieme vytiahnuť z tabuliek pretekárov. Pokiaľ sa účastní nový pretekár potrebujeme ho pridať do tabuľky pretekárov a následne pridať do preteku. Pri pridávaní pretekára do PRETEKU prebehne registrácia vozidla pretekára, pri ktorom sa kontroľujú pravidlá pre účasť. Pravidlá podľa ktorých sa budeme riadiť pri detailoch, ktoré treba skontrolovať pri registrácii http://rcamtr.sk/akcie/pravidla/. Po registrácií, majú účastníci body, body ktoré im pomôžu (odrátajú sa od výsledku) alebo im prihoršia (prirátajú sa k výsledku). Pretekáry sú vo viacerých kategóriach.
Pretek prebieha následovne: Pretekári odjazdia jednotlivé TRATE pri ktorom dostávajú body a čas. Tieto body budú následne zadané pretekárovi do aplikácia.Pretekár musí odjazdiť všetky, alebo je možnosť byť DNF (pretekár odstupil - možnosť zaškrtnutie). Všetci pretekári musia odjazdiť všetky trate, vrámci preteku (musia byť vyhodnotené). 
Po zadaní všetkých výsledkov z tratí, prichádza k vyhodnocovaniu, kde sa prepočítavajú body a časy vrámci tratí. Nastavený je limit, pri ktorom sa presiahnutý čas zaráta k bodom. (1 sekunda = 1 bod). Výsledky sa vyhodnocujú vrámci PRETEKU a všetky výsledky sú zahrnuté do celkových výsledkov vrámci celého roku. 
Všetky preteky vrámci jedného roka sú vyhodnotené celkovo, do celkové poradia za berie iba určitý počet pretekov.
