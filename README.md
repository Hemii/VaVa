# VaVa
Projekt na predmet Vývoj aplikácií s viacvrstvou architektúrou

**ZADANIE** <br>
*Vývoj aplikácie pre zapisovanie výsledkov súťaže Trial RC modelov* <br>
**POPIS** <br>
Priebeh sútaže sa nezaobíde bez týchto úkonov: <br>
Na začiatku je potrebné vytvoriť PRETEK sútaž, kde musíme navoliť koľko TRATÍ bude potrebné zadať (minimu 3 maximum 7). 
Ako náhle je vytvorený PRETEK, tak potrebujeme prihlásiť JAZDCOV. Jazdca ktorý už bol predtým na PRETEKU, si vieme vytiahnuť z tabulky PRETEKARI. Pokiaľ sa účastní nový pretekár potrebujeme ho pridať do tabuľky pretekárov a následne pridať do preteku. Pri pridávaní pretekára do PRETEKU prebehne registrácia vozidla pretekára, pri ktorom sa kkontroluje vozidlo pretekára. Tieto informácie budú uložené v jednej z dvoch tabuľiek vybava_street alebo vybava_ultimate. Pravidlá, ktoré budeme využívať pri kontrole nájdemee tu: http://rcamtr.sk/akcie/pravidla/. Po registrácií majú účastníci body, ktoré im pomôžu (odrátajú sa od výsledku) alebo im prihoršia (prirátajú sa k výsledku). Pretekári sú vo viacerých kategóriach.
<br>
Pretek prebieha následovne: Pretekári odjazdia jednotlivé TRATE, pri ktorym dostávajú body a čas. Tieto body budú následne zadané do aplikácia k dan0mu pretekarovi. Pretekár musí odjazdiť všetky, alebo je možnosť byť DNF (pretekár odstupil - možnosť zaškrtnutie) alebo DNS(pretekar nedojazdil danu sekciu). Všetci pretekári musia odjazdiť všetky trate, vrámci preteku (musia byť vyhodnotené). 
Po zadaní všetkých výsledkov prichádza k vyhodnocovaniu, kde sa prepočítavajú body a časy vrámci tratí. Nastavený je limit, pri ktorom sa presiahnutý čas zaráta k bodom (bud vseobecny limit alebo upraveny na dany pretek). (1 sekunda = 1 bod). Výsledky sa vyhodnocujú vrámci PRETEKU a všetky výsledky sú zahrnuté do celkových výsledkov vrámci celého roku. 
Všetky preteky vrámci jedného roka sú vyhodnotené celkovo, do celkové poradia za berie sa iba určitý počet pretekov (najlepsie preteky).

Musí byť možné exportovať výsledky do PDF alebo Excel
