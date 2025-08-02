package design_patterns_java.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        var project = new Project(1, "firs", "code");
        //bele yazmaq serf etmir 1.yeni parametir elave edilse gerek her yere yazaq tezeden,
        // 2.sehv etme ehtmalimiz azalir
        var project2 = new Project(project.getId(), project.getName(), project.getSourceCode());
        var projectFactory = new ProjectFactory(project);
        var projectClone = projectFactory.cloneProject();
        System.out.println(projectClone);
    }
}
