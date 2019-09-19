package TimeTable;

class Test {
    public static void main(String[] args) throws Exception {
        TimeTable.main(args);
        TimeTable.datastore.subjects.forEach(x -> System.out.println(x.shortname));
        TimeTable.datastore.subjects.stream().filter(x -> x.shortname.toUpperCase().matches("INF".toUpperCase())).forEach(x -> System.out.println(x.name));;
    }
}