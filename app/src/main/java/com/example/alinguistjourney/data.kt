package com.example.alinguistjourney

data class Answer(
    val text: String,
    val isCorrect: Boolean
)

data class QuestionData(val text: String, val answers: List<Answer>)

data class ListOfAllQuestions(
    val easy: List<QuestionData>,
    val medium: List<QuestionData>,
    val hard: List<QuestionData>
)

var listOfAllQuestions = ListOfAllQuestions(
    easy = listOf(
        QuestionData("Język francuski należy do rodziny języków", listOf(
            Answer("germańskich", false),
            Answer("celtyckich", false),
            Answer("romańskich", true),
            Answer("skandynawskich", false)
        )),
        QuestionData("Polskie słowo “Dekret” pochodzi z", listOf(
            Answer("łaciny", true),
            Answer("niemieckiego", false),
            Answer("francuskiego", false),
            Answer("włoskiego", false)
        )),
        QuestionData("Język polski należy do rodziny języków", listOf(
            Answer("północno słowiańskich", false),
            Answer("zachodnio słowiańskich", true),
            Answer("wschodnio słowiańskich", false),
            Answer("południowo słowiańskich", false)
        )),
        QuestionData("Polskie rozróżnienie ortograficzne “rz”/”ż” ma swoje pochodzenie ze względu na", listOf(
            Answer("historyczne rozróżnienie tych dźwięków", true),
            Answer("położenie geograficzne Polski", false),
            Answer("wszystkie wymienione odpowiedzi są błędne", false),
            Answer("błędy językowe, które weszły do ortografii", false)
        )),
        QuestionData("Pierwszy znany zapis w języku polskim to", listOf(
            Answer("Przełożenie biblii na język polski", false),
            Answer("“Nauka języka polskiego” Jana Kochanowskiego", false),
            Answer("Zdanie “Day, ut ia pobrusa, a ti poziwai”", true),
            Answer("Traktaty papieskie", false)
        )),
        QuestionData("Językiem oficjalnym cesarstwa rzymskiego był język", listOf(
            Answer("angielski", false),
            Answer("łaciński", true),
            Answer("arabski", false),
            Answer("francuski", false)
        )),
        QuestionData("Bizancjum jako język urzędowy miało", listOf(
            Answer("grekę", true),
            Answer("łacinę", false),
            Answer("język turecki", false),
            Answer("język ormiański", false)
        )),
        QuestionData("Język francuski powstał na bazie", listOf(
            Answer("języka niemieckiego i włoskiego", false),
            Answer("został stworzony sztucznie", false),
            Answer("nie jest to wiadome", false),
            Answer("wulgarnej łaciny", true)
        )),
        QuestionData("Oficjalnym językiem Stanów Zjednoczonych Ameryki Północnej jest", listOf(
            Answer("język angielski", false),
            Answer("brak na poziomie federalnym", true),
            Answer("język hiszpański", false),
            Answer("inny niż podane", false)
        )),
        QuestionData("Rodziny języków w Indiach, które są oficjalnie używane w administracji centralnej to", listOf(
            Answer("ugro-fińskie", false),
            Answer("turkijskie", false),
            Answer("indoeuropejskie", true),
            Answer("arabskie", false)
        )),
        QuestionData("Język bułgarski posługuje się pismem", listOf(
            Answer("cyrylicą", true),
            Answer("łacińskim", false),
            Answer("ich własnym autorskim", false),
            Answer("istnieją dwa oficjalne systemy pisma", false)
        ))
    ),
    medium = listOf(
        QuestionData("Język węgierski należy do języków", listOf(
            Answer("słowiańskich", false),
            Answer("celtyckich", false),
            Answer("ugro-fińskich", true),
            Answer("romańskich", false)
        )),
        QuestionData("Język polski, hiszpański i szwedzki należą do rodziny", listOf(
            Answer("celtyckiej", false),
            Answer("indoeuropejskiej", true),
            Answer("ugroeuropejskiej", false),
            Answer("brak powiązania rodzinnego między nimi", false)
        )),
        QuestionData("Daszek “^” nad samogłoskami w języku francuskim w słowach takich jak guêpe lub forêt oznacza, że", listOf(
            Answer("jest na tę sylabę położony akcent", false),
            Answer("jest to zabieg służący rozróżnieniu między tym słowem, a słowem “bez daszka”", false),
            Answer("zostało to skopiowane z łaciny", false),
            Answer("historycznie obok tej samogłoski była spółgłoska “s”", true)
        )),
        QuestionData("Język estoński jest najbliżej spokrewniony z", listOf(
            Answer("językiem łotewskim", false),
            Answer("językiem litewskim", false),
            Answer("językiem fińskim", true),
            Answer("językiem szwedzkim", false)
        )),
        QuestionData("Język kantoński i język szanghajski wspólnie należą do rodziny języków", listOf(
            Answer("indyjskich", false),
            Answer("chińskich", true),
            Answer("arabskich", false),
            Answer("tajskich", false)
        )),
        QuestionData("Język karelski występuje głównie w", listOf(
            Answer("Szwecji", false),
            Answer("Rosji", true),
            Answer("Niemczech", false),
            Answer("Macedonii", false)
        )),
        QuestionData("Drugim językiem urzędowym Finlandii jest", listOf(
            Answer("język szwedzki", true),
            Answer("język angielski", false),
            Answer("język norweski", false),
            Answer("język duński", false)
        )),
        QuestionData("Język baskijski występuje głównie", listOf(
            Answer("We Włoszech", false),
            Answer("W Grecji", false),
            Answer("W Irlandii", false),
            Answer("W Hiszpanii", true)
        )),
        QuestionData("Alfabet gruziński to", listOf(
            Answer("pismo łacińskie", false),
            Answer("ich własne autorskie pismo", true),
            Answer("znaki arabskie", false),
            Answer("cyrylica", false)
        )),
        QuestionData("Pierwsza forma pisma japońskiego (mająca około 1500 lat) to", listOf(
            Answer("ich własne autorskie pismo", false),
            Answer("znaki tajskie", false),
            Answer("znaki chińskie", true),
            Answer("znaki mongolskie", false)
        )),
        QuestionData("Znaki chińskie używane w języku japońskim są znane jako", listOf(
            Answer("Kanji", true),
            Answer("Hiragana", false),
            Answer("Katakana", false),
            Answer("Kata", false)
        ))
    ),
    hard = listOf(
        QuestionData("Językiem urzędowym Chińskiej Republiki Ludowej jest", listOf(
            Answer("Język szanghajski", false),
            Answer("Język kantoński", false),
            Answer("Język hakka", false),
            Answer("Język mandaryński", true)
        )),
        QuestionData("Około 40% słownictwa angielskiego ma pochodzenie", listOf(
            Answer("greckie", false),
            Answer("francuskie", true),
            Answer("niemieckie", false),
            Answer("szwedzkie", false)
        )),
        QuestionData("Główne języki Ameryki Południowej to", listOf(
            Answer("hiszpański i angielski", false),
            Answer("hiszpański i portugalski", true),
            Answer("włoski i języki autochtoniczne", false),
            Answer("hiszpański i włoski", false)
        )),
        QuestionData("W Afryce na poziomie urzędowym w większości panują", listOf(
            Answer("języki autochtoniczne", false),
            Answer("języki plemienne", false),
            Answer("języki europejskie", true),
            Answer("brak większości", false)
        )),
        QuestionData("Językiem urzędowym kanadyjskiej prowincji Québec jest", listOf(
            Answer("język angielski", false),
            Answer("język niemiecki", false),
            Answer("język hiszpański", false),
            Answer("język francuski", true)
        )),
        QuestionData("Polskie “osa”, czeskie “vosa”, angielskie “wasp” i francuskie “guêpe” wszystkie pochodzą z", listOf(
            Answer("naszego wspólnego prajęzyka od słowa *wobʰseh", true),
            Answer("z niemieckiego “Wespe”", false),
            Answer("każde ma inne pochodzenie", false),
            Answer("z łacińskiego “vespa”", false)
        )),
        QuestionData("Jedynym znanym na świecie przypadkiem, gdzie język martwy wrócił do życia jako jako język naturalny to", listOf(
            Answer("język kornijski", false),
            Answer("języki czeski", false),
            Answer("język hebrajski", true),
            Answer("język baskijski", false)
        )),
        QuestionData("Język hebrajski i języki arabskie należą do rodziny języków", listOf(
            Answer("semickich", true),
            Answer("judeo-hebrajskich", false),
            Answer("persko-arabskich", false),
            Answer("irańskich", false)
        )),
        QuestionData("Język perski należy do rodziny", listOf(
            Answer("indoeuropejskiej", true),
            Answer("arabskiej", false),
            Answer("semickiej", false),
            Answer("bantu", false)
        )),
        QuestionData("Język turecki zapisywany jest", listOf(
            Answer("pismem arabskim", false),
            Answer("znakami turkijskimi", false),
            Answer("grażdanką", false),
            Answer("łaciną", true)
        )),
        QuestionData("Potomkiem języka Egipcjan jest", listOf(
            Answer("egipska odmiana języka arabskiego", false),
            Answer("język koptyjski", true),
            Answer("język perski", false),
            Answer("język aramejski", false)
        )),
        QuestionData("Najprawdopodobniej na co dzień Jezus Chrystus posługiwał się językiem", listOf(
            Answer("hebrajskim", false),
            Answer("filistyńskim", false),
            Answer("aramejskim", true),
            Answer("koptyjskim", false)
        )),
        QuestionData("Język litewski i czeski wspólnie", listOf(
            Answer("należą do języków Hunów", false),
            Answer("są częścią rodziny bałto-słowiańskiej", true),
            Answer("są ze sobą ściśle spokrewnione", false),
            Answer("są w takim samym stopniu bliskie językowi polskiemu", false)
        )),
        QuestionData("Zjawisko kiedy osoba mówiąca językiem A jest w stanie łatwo zrozumieć osobę mówiącą językiem B niż osoba mówiąca językiem B słuchająca osoby z języka A nazywa się", listOf(
            Answer("trójkątem językowym", false),
            Answer("fałszywym przyjacielem", false),
            Answer("zrozumiałością asymetryczną", true),
            Answer("asymetryczną asymptotą", false)
        ))
    )
)
