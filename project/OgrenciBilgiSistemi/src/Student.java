public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.examNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.examNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.examNote = kimya;
        }

    }

    public void addBulkEvaluationNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.evaluationNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.evaluationNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.evaluationNote = kimya;
        }

    }

    public void isPass() {
        if (this.mat.examNote == 0||this.fizik.examNote == 0||this.kimya.examNote == 0||this.mat.evaluationNote == 0 || this.fizik.evaluationNote == 0 || this.kimya.evaluationNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.examNote +this.fizik.evaluationNote + this.kimya.examNote + this.kimya.evaluationNote + this.mat.examNote + this.mat.evaluationNote) / 6;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.examNote);
        System.out.println("Matematik Sözlü Notu : " + this.mat.evaluationNote);
        System.out.println("Fizik Notu : " + this.fizik.examNote);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.evaluationNote);
        System.out.println("Kimya Notu : " + this.kimya.examNote);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.evaluationNote);
    }
}
