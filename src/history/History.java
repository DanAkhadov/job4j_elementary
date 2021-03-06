
package history;

import java.util.Scanner;

public class History {
     static String quantityFuck = "";
     static StringBuilder oneTask = new StringBuilder("Россия всегда на несколько лет отставала в развитии от Европы. Это отразилось и на том, что в России все ещё оставался феодально-крепостнический строй тогда, когда весь мир переходил на капитализм.\n" +
            "В первой половине 19 века Россия все ещё была аграрной страной. Крестьяне составляли большую часть населения, а экономика держалась на натуральном хозяйстве. Однако резкий рост населения привёл к тому, что аграрные ресурсы постепенно истощались и в стране назрела острая необходимость перевести экономику на более прогрессивную основу – капитализм.\n" +
            "Необходимое условие для перехода к индустриальному обществу – решение крестьянского вопроса.\n" +
            "Освобождение крестьян и этапы решения крестьянского вопроса в России\n" +
            "Первые попытки решить крестьянский вопрос были предприняты при Павле 1, издавшим ряд законов, которые ослабляли влияние феодала и давали крестьянам определённую свободу. Однако заниматься крестьянским вопросов всерьёз начал только Александр 1.\n" +
            "\n" +
            "Крестьянский вопрос при Александр 1\n" +
            "1801 год - указ, дающий помещикам, купцам и удельным крестьянам вне городов покупать землю.\n" +
            "1803 год – указ «о вольных хлебопашцах», дающий право крестьянину уйти со службы барину (раскрепоститься) вместе с частью земли. \n" +
            "1809 год – указ, запрещающий помещикам ссылать своих крестьян в Сибирь без суда.\n" +
            "Согласно сведениям учёных, Александр даже давал приказ своим законотворцам разработать проект отмены крепостного права. К сожалению, тяжёлое экономическое положение в 1810-1816 годах привело к тому, что часть законов были отменены, а продажа крестьян между помещиками возобновилась с новой силой.\n" +
            "Несмотря на то, что многие законы были отменены, все же реформы Александра дали первый толчок к отмене крепостничества и решению проблем крестьянского вопроса. Прогрессивная часть населения вовсю занимались проблемами решения крестьянского вопроса и предлагали различные меры.\n" +
            "Крестьянский вопрос при Николае 1\n" +
            "Следующим императором, вдохнувшим новую жизнь в решение крестьянского вопроса стал Николай 1. Крестьяне снова получили право выкупиться с частью земли, был введён запрет на высылку крестьян на каторгу и в целом положение крепостных улучшилось. Именно при Николае 1 был заложен фундамент для будущего окончательного решения крестьянского вопроса и отмены крепостничества.\n" +
            "1837-1841 гг. – реформа государственных крестьян. Реформа улучшила правовое и материальное положение крепостных, давая им право и возможность стать самостоятельными. Созданы органы крестьянского самоуправления.\n" +
            "1841 г. – закон, запрещающий продавать крестьян по одиночке или вместе с поместьем.\n" +
            "1842 г. – закон о «вольных крестьянах». Помещики теперь могли на своё усмотрение освобождать крестьян и давать им землю, не требуя денег взамен. Однако крестьянин обязан был взамен отработать долг на выданной ему земле.\n" +
            "1843 г. – безземельные дворяне больше не имели право покупать крепостных (ликвидация рабства).");
    static StringBuilder twoTask = new StringBuilder("1801 – 1803 г. – создание и деятельность Негласного комитета. \n" +
            "8 сентября 1802 г. – учреждение 8 министерств: Военное, Морское, Иностранных Дел, Внутренних дел, Коммерции, Финансов,  Народного просвещения, Юстиции. Министры единолично принимали решения и несли за них персональную ответственность.\n" +
            "\n" +
            "1802 г. – Создание комитета министров – совещание императора с министрами и другими высшими чиновниками по вопросам, затрагивавшем интересы различных ведомств\n" +
            "\n" +
            "8 сентября 1802 г. – указ, расширявший права Сената, объявление его “Хранителем законов”, вышей судебной инстанцией, органом надзора за администрацией.\n" +
            "\n" +
            "1 января 1810 –учреждение Государственного совета.\n" +
            "\n" +
            "17 ноября 1815 г. -  введение Конституции Царства Польского, входивший в состав Российской Империи.\n" +
            "\n" +
            "1821 г. – Подготовлен проект конституции “Государственная уставная грамота Российской империи”. Законодательный парламент из 2 палат ( Сенат, Посольская палата ). Разделение страны на 12 наместничеств.");

    static StringBuilder threeTask =  new StringBuilder("Южное общество, инициатором создания которого стал П.И. Пестель, возникло на Украине в марте 1821 г: первое его отделение возникло в Тульчине, а к 1823 г. было уже три управы — Тульчинская, Васильковская и Каменская. В сентябре 1825 г. в Южное общество, во главе которого стоял директорат (П. Пестель, Н. Муравьев и А.П. Юшневский), вошло Общество русских славян, составившее четвертую управу. В свою очередь создание Южного общества ускорило создание летом 1821 г. Северного общества в Петербурге.\n" +
            "«Русская правда» уничтожала все сословные привилегии и декларировала свободу слова, вероисповедания и собраний, но запрещала создание тайных политических обществ, для борьбы с которыми создавались жандармские подразделения численностью более 100 тыс. сотрудников. Пестель крайне недоброжелательно высказывался по поводу федерализации России, отстаивая принцип унитарного государства. Крепостное право планировалось отменить, сословия ликвидировать, помещичью землю конфисковать, поскольку, по мнению Пестеля, «земля есть общая собственность всего рода человеческого». Пестель предлагал разделить земли в каждой волости на две части: «землю общественную» и «землю частную». «Конституция» Н. Муравьева предполагала конституционную монархию и неприкосновенность помещичьего землевладения. Крестьяне при освобождении получали усадьбу и по две десятины пахотной земли на двор. А удельные и государственные крестьяне оставляли себе те земли, которыми владели до революции. Если у Н. Муравьева смысл политического построения состоит в правовом обеспечении личности, то у П. Пестеля государство становится самостоятельной ценностью в будущем общественном устройстве. Свобода не входит в круг основных ценностей «Русской Правды». Тем не менее идеологическая направленность декабристов (революционная или либеральная) остается открытым вопросом. Создавая планы преобразования страны, дворянские революционеры ждали только подходящего случая для их осуществления. Они рассчитывали совершить переворот летом 1826 г., во время больших маневров в честь 25-летия царствования Александра I, когда представился бы удобный случай арестовать императора. Однако смерть Александра 119 ноября 1825 г. привела к междуцарствию и заставила заговорщиков действовать немедленно");

    static StringBuilder fourTask = new StringBuilder("Отечественная война 1812 года началась с приходом французских завоевателей на территорию Российской Империи. Армией захватчиков командовал император Франции Наполеон Бонапарт.  \n" +
            "Первый этап войны ознаменовался активным отступлением российской армии от границ, позволявшее французам легко захватывать территории. Отступление продолжалось до самой Москвы, и перед тем, как французская армия достигла столицы, произошла знаменитое сражение на Бородинском поле.  \n" +
            "В итоге Наполеон добрался до Москвы, но к тому времени она была уже сожжена. На втором этапе войны французские захватчики встретились с суровыми условиями русской зимы. Они сначала маневрировали, стараясь перейти в районы, которые не были разорены.  \n" +
            "Однако вскоре русская армия погнала их в отступление. Серьезным препятствием для французов стали холод и голод, которые и сыграли решающую роль во всей войне. Так войска Наполеона отступали до самых границ Российской Империи.  \n" +
            "На третьем этапе случились решающие бои, в которых французская армия была полностью уничтожена. Захваченные территории снова вернулись в российское подданство, а военные действия были перенесены на территорию Варшавского герцогства и Германии. Война закончилась полным поражением армии Наполеона.");

    static StringBuilder fiveTask = new StringBuilder("Кавказское направление. Восточный вопрос\n" +
            "Турция и Персия жаждали реванша. В 1826-1828 году развернулась русско-персидская война, окончившаяся Туркманчайским миром, по которому к России отошла Восточная Армения.\n" +
            "В отличие от Александра Николай поддержал греческое восстание. Россия вместе с Англией и Францией потребовали у Турции автономии для Греции. После ее отказа союзная эскадра разгромила османский флот в Наваринской бухте (1827). В ответ турки закрыли проливы для русских судов. Началась русско-турецкая война 1828-1829 годов. После поражения османов был подписан Адрианопольский мир, по которому к России отходили дельта Дуная и Черноморское побережье от Анапы до Поти. Присоединение Закавказья к России завершилось В 1833 году Николай, не хотевший полного разгрома Османской империи, выступил против ее мятежного вассала – правителя Египта. В итоге по Ункляр-Искелессийскому договору 1833 года Турция обязалась закрывать проливы для военных судов западных стран по требованию России и открывать их для нее. Это ослабило позиции европейских держав.\n" +
            "В 1817 году под руководством генерала А.П. Ермолова, командующего Кавказским корпусом, началось продвижение в горные районы Чечни и Дагестана. Опираясь на идеи мюридизма создано мощное государство – имамат. В 1840-е годы нанесены серьезные поражения русским. Тайную помощь имамату оказывали Турция и Англия. В 1859 году пало последнее убежище имама – аул Гуниб.\n" +
            "Крымская война 1853-1856 годов\n" +
            "В 1830-1840-е годы усилилось влияние западных стран на Ближний Восток и Турцию, тяготившейся опекой России. Активнее всех против нее выступала Англия, желавшая полного господства на море. После предъявленного в 1853 году ультиматума русские войска вступили в Молдавию и Валахию. Турция объявила России войну. В ноябре того же года эскадра П.С. Нахимова уничтожила турок в Синопской битве. После этого в войну вступили Англия и Франция. Их эскадры нападали на различные русские северные гарнизоны. По требованию Австрии России пришлось уйти из Молдавии и Валахии. \n" +
            "В начале 1854 года англо-франко-турецкий десант начал наступление на главную черноморскую базу – Севастополь. Осада Севастополя продолжалась 11 месяцев до августа 1855 года, когда французами был взят Малахов курган. В то же время на закавказском театре военных действий русские смогли нанести туркам ряд поражений и взять крепость Карс.\n" +
            "Итоги войны подвел Парижский мирный договор 1856 года. Севастополь и Карс были взаимно возвращены России и Турции. Провозглашалась нейтрализация Черного моря. Россия и Турция не могли иметь здесь военный флот и крепости. Россия лишалась южной Бессарабии и права покровительства Сербии, Молдавии и Валахии.");

    static StringBuilder sixTask = new StringBuilder("Подготовка реформы и отмена крепостного права.\n" +
            "Работа по подготовке реформы началась в период царствования Николая I. В это время разрабатывались проекты предполагаемых перемен, но формы документы они не приобрели.\n" +
            "\n" +
            "Александр II пошел дальше и во время его правления были созданы специальные редакционные комиссии, которые продолжили работать над проектом крестьянской реформы. Основная задача, которая стояла перед комиссией, заключалась в том, чтобы проводимые изменения не повлекли волну недовольства помещиков. В это время участились крестьянские бунты, в результате предполагаемые изменения приобрели более радикальный характер.\n" +
            "\n" +
            "В итоге 3 марта 1861 года Александр II подписал Манифест об отмене крепостного права. Положения данного Манифеста признали крестьян независимым классом общества и даровали им права. Теперь они могли владеть недвижимость, в том числе землей. Однако эту землю прежде необходимо было выкупить у помещиков за очень внушительную плату. Размер допустимого для выкупа земельного участка строго регламентировался. Также крестьяне теперь могли создавать общины и избирать своего главу.\n" +
            "Итоги отмены крепостного права.\n" +
            "Учитывая, что выкуп земельного участка по-прежнему был практически недосягаем для подавляющего большинства крестьян, это повлекло очередную волну бунтов. Правительство вынуждено было бросить силы на подавление этих восстаний, что повлекло гибель большого количества народа.\n" +
            "\n" +
            "Среди помещиков тоже присутствовало недовольство проведенной реформой, поскольку они посчитали ее концом русской государственности.\n" +
            "\n" +
            "Однако постепенно оба сословия вынуждены были смириться с произошедшими изменениями. Страна начала свой переход к индустриальному обществу.\n" +
            "\n" +
            "Однако беднейшие слои общества  не получили желаемых прав. Эта проблема вылилась в революцию 1905 года, которая стала началом пути к свержению царизма.");
    static StringBuilder sevenTask = new StringBuilder("Земская реформа 1864 года\n" +
            "Причины. Необходимость создания местного самоуправления для крестьян, которые ранее были в крепостной зависимости. Раньше именно дворянин управлял своими крепостными. После того как они получили личную свободу, дворянин стал для бывших крепостных частным лицом. Поэтому то и требовалось создать местное самоуправление.\n" +
            "Ход реформы. 1 янваля 1864 года было принято «Положение о губернских и уездных земских учреждениях».  В 1870 году было принято «Городовое положение», которое реформировало местное самоуправление в городах. Кстати, при каком императоре оно вообще появилось? Ответ пишите в комментариях!\n" +
            "Основные положения реформы:\n" +
            "1. В уездах и губерниях учреждались земства (земские собрания), которые обладали административными и хозяйственными полномочиями.\n" +
            "2 Земства переизбирались каждые три года, выборы были куриальными — по трем куриям: дворянская, купеческая и крестьянская.\n" +
            "3. Земства были всесословными органами местного самоуправления, однако избирательный закон был таков, что фактически они оказались под опекой дворян.\n" +
            "Последствия реформы.\n" +
            "1. В России появилось какое-никакое местное самоуправление.\n" +
            "2. Земства стали социальной опорой либеральной интеллигенции. Это вообще важное следствие. Все его стороны невозможно разобрать в рамках этого поста.\n" +
            "Городская реформа. 1870 г.\n" +
            "\n" +
            "Основные положения реформы были следующие:\n" +
            "1. В городах появились общественные управления. Они занимались хозяйственным вопросами, в том числе благоустройством, пожарной безопасностью, строительством пристаней, бирж, амбаров.\n" +
            "2. Органами городского управления стали: городская дума и управа, городское избирательное собрание.\n" +
            "3. Членов городских дум (гласных) избирали раз в 4 года. Им мог стать каждый, кто обладал избирательным правом. Доля нехристиан была ограничена 30 %.\n" +
            "4. Городской глава не мог быть евреем.\n" +
            "5. Расходы на городскую думу входили в ведомство губернатора.\n" +
            "6. Дума на 4 года выбирала городскую управу.\n" +
            "7. Управа ведала делами городского хозяйства и расходов сборов, составляла городские сметы. Также она могла признать решение думы незаконным.\n" +
            "Итогом реформы стало появление дум, то есть бессословных органов городского самоуправления, в 509 городах. Думы избирались горожанами, которые платили налоги и имели установленный имущественный ценз.");

    static StringBuilder eightTask = new StringBuilder("Повод:\n" +
            "Российской Империей и турецким государством послужил конфликт южнославянского населения с властями Турции в 1875-1876 годах. Точнее сказать, это были антитурецкие восстания в Сербии, Боснии, и, позднее присоединившейся Черногории. Исламская страна подавляла эти выступления самыми жестокими методами. Российская Империя, не могла оставить без внимания эти события, и весной 1877 года объявила Турции войну. Именно с этих действий начался конфликт Российской и Османской империй.\n" +
            "События:\n" +
            "В апреле 1877 года русская армия перешла реку Дунай и вышла на сторону Болгарии, который на момент действий принадлежал еще Османской Империи. Практически без особых сопротивлений к началу июля был занят Шипкинский перевал. Ответом на это турецкой стороны послужила переброска армии во главе с Сулейман-пашой для взятия этих территорий. Здесь-то и разворачиваются самые кровопролитные события русско-турецкой войны. Дело в том, что перевал Шипка имел огромное военное значение, контроль над ним предоставлял свободное продвижение русских на север Болгарии. Противник значительно превосходил силы русской армии как в вооружении, так и в людских ресурсах. К концу 1877 года Шипкинский перевал был взят русскими солдатами.\n" +
            "Но, несмотря на тяжелые поражения, турки не спешили сдаваться. Они сосредоточили основные силы в крепости Плевна. Осада Плевны оказалась переломным моментом в ходе всех вооруженных сражений русско-турецкой войны. Здесь удача была на стороне русских солдат. Также на стороне Российской Империи успешно сражались болгарские войска. В начале 1878 года русские солдаты подошли к столице Турции Константинополю. Прежде могучая и воинственная Османская Империя не смогла противостоять русской армии и в феврале того же года запросила мирных переговоров.\n" +
            "Итоги:\n" +
            "Завершающим этапом русско-турецкого конфликта стало принятие Сан-Стефанского мирного договора 19.02.1878 г. По его условиям северная часть Болгарии получала независимость (автономное княжество), подтверждалась самостоятельность Сербии, Черногории, Румынии. Россия получала Южную часть Бессарабии с крепостями Ардаган, Карс и Батум. Также Турция обязывалась выплачивать Российской Империи контрибуции в размере 1,410 млрд. рублей.");

    static StringBuilder nineTask = new StringBuilder("Земская контрреформа\n" +
            "1889 год – были введены земские начальники. Их назначал министр внутренних дел только из местных дворян, они осуществляли административно-полицейский контроль над крестьянами. Земские начальники следили за порядком, сбором податей и в случае провинностей имели право сажать крестьян под арест, подвергать телесным наказаниям. Власть земских начальников по сути восстановила права помещиков над крестьянами, утраченную ими в ходе Земской реформы Александра 2.\n" +
            "1890 год – был в значительной степени увеличен имущественный ценз для крестьян, а для помещиков — понижен. Как результат лишались избирательных прав ремесленники и мелкие торговцы. Список гласных от крестьян теперь утверждался губернатором.\n" +
            "Судебная контрреформа\n" +
            "По закону «Об изменении постановлений о присяжных заседателях» (12 июня 1884) чиновникам МВД было дано большие полномочий в формировании состава присяжных заседателей, ограничивалось право отвода, было сокращено количество присяжных в провинции.\n" +
            "Указом императора от 20 мая 1885 года вводилось Высшее дисциплинарное присутствие Сената, получившее право смещать или перемещать судей на нижестоящую должность. Предложения о такого рода мерах воздействия на судей готовило министерство юстиции.\n" +
            "1887 год, февраль – появился указ, который давал возможность любое дело по усмотрению начальства объявлять секретным, и судебное заседание должно было проходить в закрытом режиме.\n" +
            "1889 год – были ограничены правомочия присяжных заседателей\n" +
            " 1891 году – открытость гражданского суда.\n" +
            "1892 год – из за роста революционного, в том числе рабочего движения был утвержден закон «О военном положении», который позволял вводить особый режим в местностях, «опасных в революционном отношении». \n" +
            "Контрреформы в образовании\n" +
            "Был ужесточен контроль над вузами. Университетский устав 1884 года по сути упразднил автономию университетов. Ректора и профессоров назначало правительство. Плату за обучение увеличили в 2 раза. Создали особую инспекцию, осуществлявшую надзор за студентами.\n" +
            "1887 год – приняли так называемый «циркуляр о кухаркиных детях», согласно которого не рекомендовалось принимать в гимназии детей из недворянских семей, открытым текстом было сказано о запрете принимать в гимназию «детей кучеров, лакеев, прачек, мелких лавочников и тому подобных людей».");

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu();
        }

    }

    public static void menu() {
        System.out.println("1 - Ответы!");
        System.out.println("2 - Если хочешь ввести текст!");
        System.out.println("3 - Exit!");
        System.out.print("Ваш выбор: ");
        int yourNumber = myScanner.nextInt();
        switch (yourNumber) {
            case 1:
                choiceOfAnswer();
                break;
            case 2:
                results(yourAnswer());
                break;
            case 3:
                System.exit(0);
            default:
                break;
        }
    }

    public static void choiceOfAnswer() {
        System.out.print("Выбери номер вопроса от 1 до 9: ");
        int yourChoice = myScanner.nextInt();
        switch (yourChoice) {
            // Тут будут переменные у которых значением будет являться огромный текст
            case 1:
                quantityFuck = "1";
                results(oneTask);
                break;
            case 2:
                quantityFuck = "2";
                results(twoTask);
                break;
            case 3:
                quantityFuck = "3";

                results(threeTask);
                break;
            case 4:
                quantityFuck = "4";

                results(fourTask);
                break;
            case 5:
                quantityFuck = "5";

                results(fiveTask);
                break;
            case 6:
                quantityFuck = "6";

                results(sixTask);
                break;
            case 7:
                quantityFuck = "7";

                results(sevenTask);
                break;
            case 8:
                quantityFuck = "8";
                results(eightTask);
                break;
            case 9:
                quantityFuck = "9";
                results(nineTask);
                break;
            default:
                System.out.println();
                System.out.println("А ты уверена, что такой вопрос есть???????????");
                System.out.println();
                break;

        }
    }

    public static void results(StringBuilder yourChoice) {
        withoutNewLine(yourChoice);
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();
        while (true) {

            int quantity = 1;
            for (int i = 0; i < yourChoice.length(); ++i) {
                if (i != 41 * quantity) {
                    System.out.print(yourChoice.charAt(i));
                } else {
                    System.out.println(yourChoice.charAt(i));
                    System.out.println();
                    System.out.println(quantityFuck.repeat(43));
                    System.out.println();
                    quantity++;
                }
            }
            System.out.println();
            System.out.println("-----------------------------------------");
            break;
        }
    }

    static void withoutNewLine(StringBuilder yourChoice) {
        for (int index = 0; index < yourChoice.length(); index++) {
            if (yourChoice.charAt(index) == '\n') {
                yourChoice.setCharAt(index, ' ');
            }
        }
    }

    public static StringBuilder yourAnswer() {
        System.out.println();
        System.out.println("Введите ответ с новой строки (Для того чтобы закончить ввод вашего ответа, впишите \"стоп\" с новой строки!) : ");
        String yourAnswer = "";
        StringBuilder save = new StringBuilder();
        while (!yourAnswer.equals("стоп")) {
            yourAnswer = myScanner.nextLine();
            if ("стоп".equals(yourAnswer)) {
                break;
            } else {
                save.append(yourAnswer);
            }
        }
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        return save;
    }
}