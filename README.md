# HW_2_PROJECT_1

Homework for Engeto

Java 2 - Project 1

Nastal čas, abychom si ověřili rozsah tvých nově nabytých znalostí v oblasti základů programování v Javě. A to se vždy nejlépe pozná na reálném problému, před který je člověk postaven.

V rámci tohoto projektu vytvoříš aplikaci, která bude statisticky vyhodnocovat meteorologická data sbíraná a poskytovaná Českým hydrometeorologickým ústavem.

Abychom ti úkol trochu usnadnili, připravili jsme pro tebe vzorek takových dat.

Jedná se o data sebraná meteorologickou stanicí Brno - Tuřany (B2BTUR01) v červenci r. 2019. Vlastní data jsou v rámci šablony projektu uložena ve formě pole textových řetězců, kdy každý řetězec obsahuje údaje pro jeden kalendářní den.

Struktura jednoho záznamu je následující (oddělovačem každé položky je čárka):

Tvůj program by měl provést následující kroky:

A. Přivítat uživatele výpisem na standardní výstup:


B. Vypsat na standardní výstup sadu statistických údajů v následujícím rozsahu:

celkový počet denních záznamů, které se budou vyhodnocovat

průměrnou denní teplotu za sledované období

maximální teplotu za sledované období s tím, že uvedete maximální teplotu a den, ve kterém bylo toto maximum zjištěno

stejně tak pro vyhledání minimální teploty za uvedené období včetně uvedení dne

celkový počet větrných dnů za dané období (za větrný den je považován ten, kdy průměrná denní rychlost větru je větší nebo rovna 4,2 m/s)

celkový počet klidných dnů za dané období (za klidný den je považován ten, kdy průměrná denní rychlost větru je menší nebo rovna 1,8 m/s)

souhrnný přehled srážek za sledované období v rozdělení do měsíčních dekád (jedná se nám tedy o úhrny srážek za prvních deset kalendářních dnů, za druhých deset kalendářních dnů, následuje pak úhrn srážek za všechny další dny)

Všechny vypočtené hodnoty uvádějte v přesnosti na jedno desetinné místo včetně odpovídajících jednotek.


C. Vypsat na standardní výstup graf rozložení denních teplot. Jedná se nám o graf, ve kterém:

jednotlivé řádky budou zobrazovat kalendářní dny

v každém řádku bude vyznačen rozsah minimální a maximální teploty znakem *

graf bude doplněn o osy
