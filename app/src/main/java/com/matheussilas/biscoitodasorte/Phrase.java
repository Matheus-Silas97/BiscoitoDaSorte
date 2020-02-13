package com.matheussilas.biscoitodasorte;

import java.util.Random;

public class Phrase {

    public String newPhrase() {
        String[] phrases = {
                "Cada sonho que você deixa pra trás, é um pedaço do seu futuro que deixa de existir.",
                "Não interessa se você é letrado ou não, o que importa é se você vive aquilo que fala.",
                "Que no fundo é simples ser feliz. Difícil é ser tão simples",
                "Se um homem não descobriu nada pelo qual morreria, não está pronto para viver.",
                "É uma falta de responsabilidade esperarmos que alguém faça as coisas por nós.",
                "A experiência é o nome que damos aos nossos erros.",
                "Não espere por uma crise para descobrir o que é importante em sua vida.",
                "A persistência é o caminho do êxito.",
                "A vida trará coisas boas se tiveres paciência.",
                "Demonstre amor e alegria em todas as oportunidades e verás que a paz nasce dentro de você.",
                "Não compense na ira o que lhe falta na razão.",
                "Defeitos e virtudes são apenas dois lados da mesma moeda.",
                "A maior de todas as torres começa no solo.",
                "Há três coisas que jamais voltam; a flecha lançada, a palavra dita e a oportunidade perdida.",
                "A juventude não é uma época da vida, é um estado de espírito.",
                "Podemos escolher o que semear, mas somos obrigados a colher o que plantamos.",
                "Siga os bons e aprenda com eles.",
                "Não importa o tamanho da montanha, ela não pode tapar o sol.",
                "O bom-senso vai mais longe do que muito conhecimento.",
                "Quem quer colher rosas deve suportar os espinhos.",
                "São os nossos amigos que nos ensinam as mais valiosas lições.",
                "Uma iniciativa mal-sucedida não significa o final de tudo. Sempre existe uma nova oportunidade.",
                "Aquele que se importa com o sentimento dos outros, não é um tolo.",
                "A adversidade é um espelho que reflete o verdadeiro eu.",
                "Lamentar aquilo que não temos é desperdiçar aquilo que já possuímos.",
                "Sem o fogo do entusiasmo, não há o calor da vitória.",
                "O riso é a menor distância entre duas pessoas.",
                "Os defeitos são mais fortes quando o amor é fraco.",
                "Amizade e Amor são coisas que podem virar uma só num piscar de olhos.",
                "Surpreender e ser surpreendido é o segredo do amor.",
                "Faça pequenas coisas agora e maiores coisas lhe serão confiadas cada dia.",
                "Todo mundo é capaz de denominar uma dor, exceto quem a sente.",
                "A sorte favorece a mente bem preparada.",
                "Sua visão se tornará clara apenas quando você puder olhar dentro de seu coração.",
                "Quem olha para fora sonha; quem olha para dentro acorda.",
                "As pessoas se esquecerão do que você disse e do que você fez… mas nunca se esquecerão de como você as fez sentir.",
                "Espere pelo mais sábio dos conselhos: o tempo.",
                "Todas as coisas são difíceis antes de se tornarem fáceis.",
                "Você pode encontrar a si mesmo fazendo ou dizendo coisas que você nunca imaginou possíveis.",
                "Se você se sente só é porque construiu muros ao invés de pontes.",
                "O amor está mais próximo do que você imagina.",
                "A vida coloca em nossa frente opções.",
                "Você é do tamanho do seu sonho.",
                "Pare de procurar eternamente; a felicidade está bem ao seu lado.",
                "Conhecimento é a única virtude e ignorância é o único vício.",
                "O nosso primeiro e último amor é… o amor-próprio.",
                "Deixe de lado as preocupações e seja feliz.",
                "A vontade das pessoas é a melhor das leis.",
                "Nós somos o que pensamos.",
                "A maior barreira para o sucesso é o medo do fracasso.",
                "O pessimista vê a dificuldade em cada oportunidade; O otimista vê a oportunidade em cada dificuldade.",
                "Muitas das grandes realizações do mundo foram feitas por homens cansados e desanimados que continuaram trabalhando.",
                "O insucesso é apenas uma oportunidade para recomeçar de novo com mais inteligência.",
                "O futuro pertence àqueles que acreditam na beleza de seus sonhos.",
                "O verdadeiro homem mede a sua força, quando se defronta com o obstáculo.",
                "Você precisa fazer aquilo que pensa que não é capaz de fazer.",
                "Quem quer vencer um obstáculo deve armar-se da força do leão e da prudência da serpente.",
                "A adversidade desperta em nós capacidades que, em circunstâncias favoráveis, teriam ficado adormecidas.",
                "Motivação não é sinônimo de transformação, mas um passo em sua direção.",
                "O que empobrece o ser humano, não é a falta de dinheiro, mais sim, a falta de fé,motivação e criatividade.",
                "Inspiração vem dos outros. Motivação vem de dentro de nós.",
                "A nossa vida tem 4 sentidos…amar, sofrer, lutar e vencer. Ame muito, sofra pouco, lute bastante e vença sempre!",
                "Nada é por acaso… Acredite em seus sonhos e nos seus potenciais...Na vida tudo se supera.",
                "Você sempre será a sua melhor companhia.",
                "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.",
                "A descoberta consiste em ver o que todos viram e em pensar no que ninguém pensou."

        };

        int num = new Random().nextInt(phrases.length);

        String phraseSelect = (phrases[num]);

        return phraseSelect;

    }
}


