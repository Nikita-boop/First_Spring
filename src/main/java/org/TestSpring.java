package org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = context.getBean("musicBean", Music.class);

        MusicalPlayer musicalPlayer = new MusicalPlayer(music);
        musicalPlayer.playMusic();
        context.close();
    }
}
