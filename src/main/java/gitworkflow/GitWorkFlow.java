package gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {
        String step1 = "Perform git stash - to store uncommitted changes";
        String step2 = "Perform git checkout master - to move to the local master branch";
        String step3 = "Perform fetch command - to fetch the origin branches";
        String step4 = "Perform git checkout -b new_branch_name to create and instantly move to a new branch, " +
                "this is identical to local master branch";
        String step5 = "Add your changes related to the task";
        String step6 = "Review the changes and check the code before to commit them";
        String step7 = "Execute git commit using IntelliJ interface, where you can select the changes that you want to commit";
        String step8 = "Once the changes are committed, execute git push command by using CTRL+ALT+K hot keys ";
        String step9 = "The committed are pushed to origin branch with the same name, navigate to the GitHub branch";
        String step10 = "Create pull request from origin/new_branch_name into origin/master";
        String step11 = "Add the Pull request details - name, description and request review from your colleagues";
        String step12 = "If you collect at least 2 approvals from your colleagues then merge the branch";
        String step13 = "After that, the origin/master contains the latest changes and origin/new_branch_name can be deleted";
        String step14 = "But don't forget that locally you are still on new_branch_name, it's good to move back to master";
        String step15 = "However, the local master branch does not have the latest changes, therefore perform a git fetch and git pull";
        String step16 = "Perform a 'git commit amend', to change the latest executed commit, by adding the requested changes ";
        String step17 = "Perform 'git force push' to update the status of pull request";
        String step18 = "Don't forget that locally, you are still on the New_Name_Branch, so move back to master branch";
        String step19 = "Perform 'git fetch' and 'git pull' to update the local master with the latest origin/master changes";

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
        System.out.println(step16);
        System.out.println(step17);
        System.out.println(step18);
        System.out.println(step19);
    }
}
