package design_patterns_java.prototype;

public class Project implements VersionControlCommands {
    private  final long id;

    private final String name;
     private final String sourceCode;

     public Project(long id, String  name, String sourceCode){
         this.id=id;
         this.name=name;
         this.sourceCode=sourceCode;
     }

    @Override
    public Object copy() {
        return new Project(id, name,sourceCode);
    }

   // get metodlarini ferqi gormek ucun yaziriq , eslinde ehtiyac yoxdur


    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
