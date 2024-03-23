package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) throws TelegramApiException {
    System.out.println("Iniciando BOT");
    TelegramBotsApi BotsApi = new TelegramBotsApi(DefaultBotSession.class);
    BotsApi.registerBot(new Bot());
  }
}