package votingsystem;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VotingSystem {
    private List<Candidate> candidates;

    public VotingSystem() {
        candidates = new ArrayList<>();
    }

    public void addCandidate(String name) {
        candidates.add(new Candidate(name));
    }

    public void castVote(String candidateName) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equalsIgnoreCase(candidateName)) {
                candidate.addVote();
                System.out.println("Голос учтён для: " + candidateName);
                return;
            }
        }
        System.out.println("Кандидат с именем \"" + candidateName + "\" не найден.");
    }

    public void showResults() {
        System.out.println("\nРезультаты голосования:");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getName() + ": " + candidate.getVotes() + " голосов");
        }
    }

    public static void main(String[] args) {
        // Ensure System.out uses UTF-8 encoding
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        VotingSystem votingSystem = new VotingSystem();
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        // Ввод количества кандидатов
        System.out.print("Введите количество кандидатов: ");
        int candidateCount = scanner.nextInt();
        scanner.nextLine(); // Очистка строки после ввода числа

        // Ввод имен кандидатов
        for (int i = 1; i <= candidateCount; i++) {
            System.out.print("Введите имя кандидата #" + i + ": ");
            String name = scanner.nextLine();
            votingSystem.addCandidate(name);
        }

        // Процесс голосования
        System.out.println("\nГолосование началось. Введите 'стоп' для завершения.");
        while (true) {
            System.out.print("Введите имя кандидата, за которого хотите проголосовать: ");
            String candidateName = scanner.nextLine();
            if (candidateName.equalsIgnoreCase("стоп")) {
                break;
            }
            votingSystem.castVote(candidateName);
        }

        // Показ результатов
        votingSystem.showResults();
        scanner.close();
    }
}