package com.example.marinalegenda;

import android.widget.Switch;

import com.example.marinalegenda.R;

public class per {
    public static String numbertest = "";
    public static String ansver1 = "";
    public static String ansver2 = "";
    public static String ansver3 = "";
    public static String oper2 = "";
    public static String vopr = "";
    public static String textout = "";
    public static Integer imout = R.drawable.chapaev ;

    public static void vopros(String numbertest1,String numberactiv1) {
        String vibor1=numbertest1+numberactiv1;
        switch  (vibor1) {
            case "11":
                vopr="Ты добрый?";
                break;
            case "12":
                vopr="Ты общительный?";
                break;
            case "13":
                vopr="Ты весёлый?";
                break;
            case "21":
                vopr="Ты способен повести за собой других, ты лидер?";
                break;
            case "22":
                vopr="Ты образован, умён?";
                break;
            case "23":
                vopr="Ты с любовью относишься к людям?";
                break;
            case "31":
                vopr="Ты часто совершаешь хорошие поступки?";
                break;
            case "32":
                vopr="Ты скромный?";
                break;
            case "33":
                vopr="Ты общительный?";
                break;
            default:
                break;
        }
    }
    public static void my1(String number1,String a1,String a2,String a3) {
        String vibor = number1+a1+a2+a3;
        switch  (vibor) {
            case "1111":
                textout = "Ты похож на кота Леопольда. Он очень добрый, общительный, веселый и всегда прощает других.";
                imout=R.drawable.kotleopold;
                break;
            case "1112":
                textout = "Ты похож на русалочку. Она была доброй, но часто грустила из-за принца.";
                imout=R.drawable.rusalochka;
                break;
            case "1121":
                textout = "Ты похож на Белль из мультфильма 'Красавица и чудовище'. Белль не была общительной, но любила делать добрые дела. Она смотрела в первую очередь не на внешность, а на внутренний мир человека.";
                imout= R.drawable.bell;
                break;
            case "1122":
                textout = "Ты похож на пина из мультфильма 'Смешарики'. Пин добрый и всегда готов помочь своим друзьям, но он не слишком общительный и иногда грустит.";
                imout=R.drawable.pin;
                break;
            case "1211":
                textout = "Ты похож на волка из советского мультфильма 'Ну погоди'. Волк был злым, котому что охотился на зайца, но был веселым, всегда верил, чо поймает зайца несмотря на неудачи.";
                imout=R.drawable.volknupogodi;
                break;
            case "1212":
                textout = "Ты похож на Урсулу из мультфильма 'Русалочка'. Урсула была злой ведьмой, которая заставила русалочку отдать ей свой голос.";
                imout=R.drawable.ursula;
                break;
            case "1221":
                textout = "Ты похож на снежную королеву. Она была злой и забрала мальчика Кая в свой дворец. ";
                imout=R.drawable.sneznayakoroleva;
                break;
            case "1222":
                textout = "Ты похож на паука Шнюка из мультфильма 'Лунтик'. Он был необщительным и грустным, иногда злился на Лунтика и его друзей. ";
                imout=R.drawable.paukshnuk;
                break;
            case "2111":
                textout = "Ты похож на величайшего русского полководца Александра Суворова. Он не проиграл ни одного сражения, был основоположником русского военного искусства, всегда с любовью относился к людям";
                imout=R.drawable.suvorov;
                break;
            case "2112":
                textout = "Ты похож на Наполеона Бонапарта, французского полководца.Он был стмволом военного гения и политического таланта, обладал большими знаниями и интеллектом. Однако  при этом слыл большим эгоистом.";
                imout=R.drawable.napoleon;
                break;
            case "2121":
                textout = "Ты похож на Василия Чапаева, командира Красной Армии. Не имея специального образования, он выдвинулся на высокие командные посты за счет своей энергии и доброты.";
                imout=R.drawable.chapaev;
                break;
            case "2122":
                textout = "Ты похож на Степана Бандеру, лидера украинских националистов. Он был лидером группировки, помогавшей Гитлеру, отличился особой жестокостью к мирному населению. Не имел достаточного образования.";
                imout=R.drawable.stepanbandera;
                break;
            case "2211":
                textout = "Ты похож на Антона Павловича Чехова, великого русского писателя. Он не стремился к лидерству, был очень образованным человеков. В своих произведениях он всегда с любовью описывал простых русских людей.";
                imout=R.drawable.chehov;
                break;
            case "2212":
                textout = "Ты похож на Льва Толстого,великого русского писателя. Он не стремился к лидерству, был образованным человеком. Окружающие отмечали его непростой характер и резкость. ";
                imout=R.drawable.tolstoy;
                break;
            case "2221":
                textout = "Ты похож на Фёдора Иоановича, сына Ивана Грозного.  Он был не способен к правлению, за него это фактически делал Борис Годунов, но слыл очень добрым и богомольным человеком.";
                imout=R.drawable.fedorivanovich;
                break;
            case "2222":
                textout = "Ты похож на помещицу Дарью Салтыкову, известную под прозвищем 'Салтычиха'.Она очень не любила своих крестьян и подвергала их жестоким наказаниям. При этом она не обладала значительным умом и положительной энергией лидера. ";
                imout=R.drawable.dariasaltikova;
                break;
            case "3111":
                textout = "Ты похож на Золушку. Ты очень скромный человек, который любит совершать хорошие поступки и помогать другим.";
                imout=R.drawable.zolushka;
                break;
            case "3112":
                textout = "Ты похож на Герасима из рассказа 'Муму'. Ты скромный и не очень общительный человек, однако ты любишь совершать хорошие поступки.";
                imout=R.drawable.gerasim;
                break;
            case "3121":
                textout = "Ты похож на Мориса Джеральда из романа 'Всадник без головы'. Ты общительный и часто совершаешь хорошие поступки.";
                imout=R.drawable.morisdzerald;
                break;
            case "3122":
                textout = "Ты похож на Владимира Дубровского. Ты нескромный и любишь совершать хорошие поступки.";
                imout=R.drawable.dubrovskij;
                break;
            case "3211":
                textout = "Ты похож на Алешу из рассказа 'Черная курица или подземные жители'. Ты не часто совершаешь хорошие поступки, зато ты общительный и скромный.";
                imout=R.drawable.alesha;
                break;
            case "3212":
                textout = "Ты похож на Молчалина из поэмы 'Горе от ума'. Ты очень скромный, редко совершаешь хорошие поступки.";
                imout=R.drawable.molchalin;
                break;
            case "3221":
                textout = "Ты похож на Троекурова из повести 'Дубровский'. Ты нескромный и не любишь совершать хорошие поступки.";
                imout=R.drawable.troekurov;
                break;
            case "3222":
                textout = "Ты похож на мачеху из сказки 'Золушка'. Ты нескромный, не совершаешь хороших поступков";
                imout=R.drawable.macheha;
                break;
            default:
                break;
        }
    }
}