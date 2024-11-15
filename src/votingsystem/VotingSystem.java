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

    // Новый метод для получения списка кандидатов
    public List<Candidate> getCandidates() {
        return candidates;
    }

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        VotingSystem votingSystem = new VotingSystem();
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.print("Введите количество кандидатов: ");
        int candidateCount = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= candidateCount; i++) {
            System.out.print("Введите имя кандидата #" + i + ": ");
            String name = scanner.nextLine();
            votingSystem.addCandidate(name);
        }

        System.out.println("\nГолосование началось. Введите 'стоп' для завершения.");
        while (true) {
            System.out.print("Введите имя кандидата, за которого хотите проголосовать: ");
            String candidateName = scanner.nextLine();
            if (candidateName.equalsIgnoreCase("стоп")) {
                break;
            }
            votingSystem.castVote(candidateName);
        }

        votingSystem.showResults();
        scanner.close();
    }
}
