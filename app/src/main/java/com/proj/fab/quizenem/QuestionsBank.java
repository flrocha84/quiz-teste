package com.proj.fab.quizenem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class QuestionsBank {


    private static List<QuestionsList> quimicaQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        //criando as perguntas
        final QuestionsList question1 = new QuestionsList("Q1 - Quem matou o rei?", "o palhaço", "o cão", "o gato","o assassino","o assassino","","porque o assassino é ruim");
        final QuestionsList question2 = new QuestionsList("Q2 - Que cor é azul?", "azul","preto", "branco","amarelo", "azul","","porque azul é a cor do céu");
        final QuestionsList question3 = new QuestionsList("Q3 - Que cor é preta?","azul","preto", "branco","amarelo", "preto","","porque é escuro");
        final QuestionsList question4 = new QuestionsList("Q4 - Que cor é branco?","azul","preto", "branco","amarelo", "branco","","poque é a cor da paz");
        final QuestionsList question5 = new QuestionsList("Q5 - Que cor é amarelo?","azul","preto", "branco","amarelo", "amarelo","","porque parece o sol");
        final QuestionsList question6 = new QuestionsList("Q6 - Que cor é amarelo?","azul","preto", "branco","amarelo", "amarelo","","já falei que parece com o sol");

        // adicionando na lista
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        Collections.shuffle(questionsLists);
        return questionsLists;
    }


    private static List<QuestionsList> fisicaQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        //criando as perguntas
        final QuestionsList question1 = new QuestionsList("F1 - Quem matou o rei?", "o palhaço", "o cão", "o gato","o assassino","o assassino","","porque o assassino é ruim");
        final QuestionsList question2 = new QuestionsList("F2 - Que cor é azul?", "azul","preto", "branco","amarelo", "azul","","porque azul é a cor do céu");
        final QuestionsList question3 = new QuestionsList("F3 - Que cor é preta?","azul","preto", "branco","amarelo", "preto","","porque é escuro");
        final QuestionsList question4 = new QuestionsList("F4 - Que cor é branco?","azul","preto", "branco","amarelo", "branco","","poque é a cor da paz");
        final QuestionsList question5 = new QuestionsList("F5 - Que cor é amarelo?","azul","preto", "branco","amarelo", "amarelo","","porque parece o sol");
        final QuestionsList question6 = new QuestionsList("F6 - Que cor é amarelo?","azul","preto", "branco","amarelo", "amarelo","","já falei que parece com o sol");

        // adicionando na lista
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        Collections.shuffle(questionsLists);
        return questionsLists;
    }

    private static List<QuestionsList> biologiaQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        //criando as perguntas

        final QuestionsList question1 = new QuestionsList("B1 - Quem matou o rei?", "o palhaço", "o cão", "o gato","o assassino","o assassino","","porque o assassino é ruim");
        final QuestionsList question2 = new QuestionsList("B2 - Que cor é azul?", "azul","preto", "branco","amarelo", "azul","","porque azul é a cor do céu");
        final QuestionsList question3 = new QuestionsList("B3 - Que cor é preta?","azul","preto", "branco","amarelo", "preto","","porque é escuro");
        final QuestionsList question4 = new QuestionsList("B4 - Que cor é branco?","azul","preto", "branco","amarelo", "branco","","poque é a cor da paz");
        final QuestionsList question5 = new QuestionsList("B5 - Que cor é amarelo?","azul","preto", "branco","amarelo", "amarelo","","porque parece o sol");
        final QuestionsList question6 = new QuestionsList("B6 - Que cor é amarelo?","azul","preto", "branco","amarelo", "amarelo","","já falei que parece com o sol");

        // adicionando na lista
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        Collections.shuffle(questionsLists);
        return questionsLists;
    }
    private static List<QuestionsList> historiaQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        //criando as perguntas

        final QuestionsList question1 = new QuestionsList("H1 - Quem matou o rei?", "o palhaço", "o cão", "o gato","o assassino","o assassino","","porque o assassino é ruim");
        final QuestionsList question2 = new QuestionsList("H2 - Que cor é azul?", "azul","preto", "branco","amarelo", "azul","","porque azul é a cor do céu");
        final QuestionsList question3 = new QuestionsList("H3 - Que cor é preta?","azul","preto", "branco","amarelo", "preto","","porque é escuro");
        final QuestionsList question4 = new QuestionsList("H4 - Que cor é branco?","azul","preto", "branco","amarelo", "branco","","poque é a cor da paz");
        final QuestionsList question5 = new QuestionsList("H5 - Que cor é amarelo?","azul","preto", "branco","amarelo", "amarelo","","porque parece o sol");
        final QuestionsList question6 = new QuestionsList("H6 - Que cor é amarelo?","azul","preto", "branco","amarelo", "amarelo","","já falei que parece com o sol");

        // adicionando na lista

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        Collections.shuffle(questionsLists);
        return questionsLists;
    }
public static List<QuestionsList> getQuestions(String selectTopicName){
        switch (selectTopicName){
            case "quimica":
                return quimicaQuestions();
            case "fisica":
                return fisicaQuestions();
            case "biologia" :
                return biologiaQuestions();
            default:
                return historiaQuestions();
        }
  }


}
