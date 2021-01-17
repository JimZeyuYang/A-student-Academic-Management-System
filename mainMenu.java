package GUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainMenu extends javax.swing.JFrame {
    
    public static university colleges [] = inputRanking();
    
    public static linkNode head, p, q;
    
    public mainMenu() {
        initComponents();
        inputSubRanking(colleges);
        
        String list [] = readMyUni();
        
        head = new linkNode(list[0]);
        for (int i = 1; i < list.length; i++) {
            head = addNode (list[i], head);
        }
        
    }
    
   
    
    public void close () {
        this.setVisible(false);
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewUni = new javax.swing.JButton();
        viewGrade = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewUni.setFont(new java.awt.Font("Trajan Pro", 1, 13)); // NOI18N
        viewUni.setText("View Universities");
        viewUni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUniActionPerformed(evt);
            }
        });

        viewGrade.setFont(new java.awt.Font("Trajan Pro", 1, 13)); // NOI18N
        viewGrade.setText("View Grade");
        viewGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewGradeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 48)); // NOI18N
        jLabel1.setText("Way to");

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 48)); // NOI18N
        jLabel2.setText("Ivy League");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(viewUni, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewUni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewGradeActionPerformed
        if (did) {
            yourGradeBook gradeBook = new yourGradeBook();
            gradeBook.setVisible(true);
            close();
        } else {        
            tigerNetLogin loginPage = new tigerNetLogin();
            loginPage.setVisible(true);
            close();
        }
    }//GEN-LAST:event_viewGradeActionPerformed

    private void viewUniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUniActionPerformed
        universityPage university = new universityPage();
        university.setVisible(true);
        close();
    }//GEN-LAST:event_viewUniActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }
    
    public static int num = 0;
    
    public static boolean did = false;
    
    public static void outputGrade (String username, String password) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://ridleycollege.myschoolapp.com/app#login");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//*[@id=\"Username\"]")).sendKeys(username);
        
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(password);
        
        driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//*[@id=\"progress-btn\"]")).click();
        
        WebElement courses = driver.findElement(By.xpath("//*[@id=\"coursesContainer\"]"));
        
        List<WebElement> grades = courses.findElements(By.className("row"));
        
        driver.findElement(By.xpath("//*[@id=\"coursesContainer\"]/div[1]/div[4]/a")).click();
        
        try {

            PrintWriter out = new PrintWriter(new FileWriter("grade.txt"));
            
            for (int i = 0; i < grades.size(); i++) {
                Thread.sleep(500);
                if (driver.findElement(By.xpath("//*[@id=\"site-modal\"]/div/div/div[2]/div[1]/div[1]/div[1]/h1")).getText().compareTo("--") != 0) {
                    
                    if (i != 0) {
                        out.println("CLASS");
                    }
                    out.println(driver.findElement(By.xpath("//*[@id=\"site-modal\"]/div/div/div[1]/h1")).getText());
                    out.println("CUT");
                    out.println(driver.findElement(By.xpath("//*[@id=\"site-modal\"]/div/div/div[2]/div[1]/div[1]/div[1]/h1")).getText() + "\n");
                    
                    WebElement course = driver.findElement(By.xpath("//*[@id=\"site-modal\"]/div/div/div[2]"));
                    List<WebElement> bins = course.findElements(By.className("table"));
                    
                    WebElement category = driver.findElement(By.xpath("//*[@id=\"site-modal\"]/div/div/div[2]/div[1]/div[2]"));
                    List<WebElement> marks = category.findElements(By.className("progress"));
                    List<WebElement> name = category.findElements(By.tagName("h6"));
                    
                    
                    for (int j = 0; j < bins.size(); j++) {
                        
                        out.println("BINS");
                        
                        out.println(name.get(j).getText());
                        out.println("CUT");
                        out.println(marks.get(j).getText());
                        
                        List<WebElement> assignment = bins.get(j).findElements(By.className("col-md-3"));
                        List<WebElement> points = bins.get(j).findElements(By.className("col-md-2"));
                        List<WebElement> dates = bins.get(j).findElements(By.className("col-md-1"));
                        
                        for (int k = 0; k < assignment.size(); k++) {
                            out.println("AssIGNMENTS");
                            num++;
                            out.println(assignment.get(k).getText());
                            out.println("CUTCUT");
                            out.println(points.get(k).getText());
                            out.println("CUTCUT");
                            out.println(dates.get(2*k).getText());
                            out.println("CUTCUT");
                            out.println(dates.get(2*k+1).getText());
                        }
                    }
                    
                }
                if (i < grades.size()-1) {
                   driver.findElement(By.xpath("//*[@id=\"site-modal\"]/div/div/div[3]/button[2]")).click();
                } else {
                    break;
                }
                
            }
            out.close();
      
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
        
        driver.quit();
    }
    
    public static assignments [] inputGrade (int number) {
        
        int num = number;
        
        String input;
        String grade = "";
        int posn = 0;
        boolean ok = false;
        int count = 0;
        
        assignments all [] = new assignments [num];
        
        for (int i = 0; i < all.length; i++) {
            all[i] = new assignments();
                    
        }
        
        try {
            File inFile = new File("grade.txt");
            BufferedReader in = new BufferedReader(new FileReader(inFile));
            
            if (inFile.exists() && inFile.length() != 0) {
                ok = true;
                input = in.readLine();
                
                while (input != null) {
                    grade += input;
                    posn++;
                    input = in.readLine();
                }
            in.close(); 
         
            }
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
        
        String classes [] = new String [0];
        
        classes = grade.split("CLASS");
        
        for (int i = 0; i < classes.length; i++) {
            String bins [] = new String [0];
            bins = classes[i].split("BINS");
            
            for (int j = 0; j < bins.length; j++) {
                if (j != 0) {
                    String tem [] = new String [2];
                    tem = bins[0].split("CUT");

                    String assignments [] = new String [0];
                    assignments = bins[j].split("AssIGNMENTS");
                    
                    String temp [] = new String [2];
                    temp = assignments[0].split("CUT");
                    
                    for (int k = 0; k < assignments.length; k++) {
                        if (k != 0) {
                            
                            all[count].setCourseName(tem[0].substring(0, tem[0].length()-9));
                            all[count].setCourseGrade(Double.parseDouble(tem[1].substring(0, 5)));
                            
                            all[count].setCategoryName(temp[0]);
                            all[count].setCategoryGrade(Double.parseDouble(temp[1]));
                            
                            String data [] = new String [0];
                            data = assignments[k].split("CUTCUT");
                            
                            for (int l = 0; l < data.length; l++) {
                                if (l == 0) {
                                    all[count].setAssignmentName(data[l]);
                                } else if (l == 1) {
                                    String mark [] = new String [2];
                                    mark = data[l].split("/");
                                    double tempp = 0;
                                    if (mark[0].compareToIgnoreCase("") != 0) {
                                        tempp = 100*Double.parseDouble(mark[0])/Double.parseDouble(mark[1]);
                                    }
                                    all[count].setAssignmentGrade(tempp);
                                } else if (l == 2) {
                                    all[count].setDateAssigned(data[l]);
                                } else if (l == 3) {
                                    all[count].setDateDue(data[l]);
                                    count++;
                                }

                            }
                          
                        }
                        
                    }
                 
                }
                
            }
        }
        
        return all;
        
    }
    
    public static void outputRanking () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        
        WebDriver driver2 = new ChromeDriver();
        
        driver2.get("https://www.usnews.com/education/best-global-universities/rankings");
        
        driver2.manage().window().maximize();
        
        int cc = 1;

        int times = Integer.parseInt(driver2.findElement(By.xpath("//*[@id=\"resultsMain\"]/div[2]/a[2]")).getText());
        
        university colleges [] = new university [times*10];
        
        
        try {

            PrintWriter out = new PrintWriter(new FileWriter("ranking.txt"));
            
                for (int i = 0; i < times; i++) {
            
                Thread.sleep(2000);
            
                WebElement table = driver2.findElement(By.id("resultsMain"));
            
                List<WebElement> unis = table.findElements(By.className("sep"));
            
                for (int j = 0; j < 10; j++) {
                    out.println(cc + "##");
                    out.println(unis.get(j).findElement(By.className("h-taut")).getText() + "##");
                    out.println(unis.get(j).findElement(By.className("t-taut")).getText());
                    out.println("SEP");
                    cc++;
                }

                WebElement footer = driver2.findElement(By.xpath("//*[@id=\"resultsMain\"]/div[2]"));
                List<WebElement> buttoms = footer.findElements(By.className("pager_link"));
                buttoms.get(buttoms.size()-1).click();
            }
                
            out.close();
        
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
        
        driver2.quit();     
    }
    
    public static university [] inputRanking () {
        university colleges [] = new university [1250];
        
        String input;
        String list = "";
        int posn = 0;
        boolean ok = false;
        
        
        try {
            File inFile = new File("ranking.txt");
            BufferedReader in = new BufferedReader(new FileReader(inFile));
            
            if (inFile.exists() && inFile.length() != 0) {
                ok = true;
                input = in.readLine();
                
                while (input != null) {
                    list += input;
                    posn++;
                    input = in.readLine();
                }
            in.close(); 
         
            }
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
        
        String allUnis [] = new String [1250];
        allUnis = list.split("SEP");
        
        for (int i = 0; i < allUnis.length; i++) {
            String temp [] = new String [3];
            temp = allUnis[i].split("##");
            
            colleges[i] = new university(Integer.parseInt(temp[0]), temp[1], temp[2]);
            
        }
        return colleges;
    }
    
    public static void outputSubRanking () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        
        WebDriver driver3 = new ChromeDriver();
        
        driver3.get("https://www.usnews.com/education/best-global-universities/rankings");
        
        driver3.manage().window().maximize();
        
        
        String subjects [] = new String [22];
        
        try {

            PrintWriter out = new PrintWriter(new FileWriter("subjectRanking.txt"));
        
//            for (int i = 1; i < subjects.length + 1; i++) {
int i = 22;
                
                Thread.sleep(3000);
                
                driver3.findElement(By.xpath("//*[@id=\"subject_chzn\"]/a")).click();
                
                Thread.sleep(3000);

                subjects[i-1] = driver3.findElement(By.xpath("//*[@id=\"subject_chzn_o_" + i + "\"]")).getText();
            
                System.out.println(driver3.findElement(By.xpath("//*[@id=\"subject_chzn_o_" + i + "\"]")).getText());
                
                driver3.findElement(By.xpath("//*[@id=\"subject_chzn_o_" + i + "\"]")).click();

                int cc = 1;
            
                Thread.sleep(3000);

                int times = Integer.parseInt(driver3.findElement(By.xpath("//*[@id=\"resultsMain\"]/div[2]/a[2]")).getText());
                
                System.out.println(times);
            
                university colleges [] = new university [times*10];
            
            
                for (int j = 0; j < times; j++) {
            
                    Thread.sleep(3500);
            
                    WebElement table = driver3.findElement(By.id("resultsMain"));
            
                    List<WebElement> unis = table.findElements(By.className("sep"));
            
                    for (int k = 0; k < 10; k++) {
                        out.println(cc + "##");
                        out.println(unis.get(k).findElement(By.className("h-taut")).getText() + "SEP");
                        cc++;
                    }
                    System.out.println("    " + j);
                    WebElement footer = driver3.findElement(By.xpath("//*[@id=\"resultsMain\"]/div[2]"));
                    List<WebElement> buttoms = footer.findElements(By.className("pager_link"));
                    buttoms.get(buttoms.size()-1).click();
                }
                
                out.println("SUBSUBSUB");
                
//            }
            
            out.close();
            
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
        driver3.close();
        
    }
    
    public static void inputSubRanking (university [] colleges) {
        quickSort(colleges, 0, colleges.length-1);
        
        String inputt;
        String listt = "";
        int posnn = 0;
        boolean okk = false;
        
        try {
            File inFile = new File("subjectRanking.txt");
            BufferedReader in = new BufferedReader(new FileReader(inFile));
            
            if (inFile.exists() && inFile.length() != 0) {
                okk = true;
                inputt = in.readLine();
                
                while (inputt != null) {
                    listt += inputt;
                    posnn++;
                    inputt = in.readLine();
                }
            in.close(); 
         
            }
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
        
        String allSubs [] = new String [0];
        allSubs = listt.split("SUBSUBSUB");
        
        for (int i = 0; i < allSubs.length; i++) {
            String unis [] = allSubs[i].split("SEP");
            
                for (int j = 0; j < unis.length; j++) {
                    
                    String temp [] = unis[j].split("##");
                    colleges[binarySearch(colleges, temp[1])].setSubRank(i, Integer.parseInt(temp[0]));
                }
        }
    }
    
    public static void printArray(university arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.println(arr[i].getName());
        }
    }
    
    public static int partition (university arr[], int low, int high) {
        
        String pivot = arr[high].getName(); 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j].getName().compareToIgnoreCase(pivot) <= 0) {
                i++;
 
                // swap arr[i] and arr[j]
                university temp = new university();
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        university temp = new university();
        temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
    
    public static void quickSort (university arr[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    
    public static int binarySearch (university arr [], String key) {
        int max = arr.length;
        int min = 0;
        int mid = (max + min) /2;
        
        while (max > min) {
            mid = (max + min) /2;;
            if (key.compareToIgnoreCase(arr[mid].getName()) > 0) {
                min = mid;
            } else if (key.compareToIgnoreCase(arr[mid].getName()) < 0) {
                max = mid;
            } else {
                return mid;
            } 
        }
        return -1;
    }
    
    public static void quickSortRank (int rank[], int index [], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partitionRank(rank, index, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSortRank(rank, index, low, pi-1);
            quickSortRank(rank, index, pi+1, high);
        }
    }
    
    public static int partitionRank (int rank[], int index [], int low, int high) {
        int pivot = rank[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (rank[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = rank[i];
                rank[i] = rank[j];
                rank[j] = temp;
                // also swap the Index
                int tem = index[i];
                index[i] = index[j];
                index[j] = tem;
            }
        }
        // swap the pivot to the "wall" which all 
        //number on the left are smaller and right are bigger
        int temp = rank[i+1];
        rank[i+1] = rank[high];
        rank[high] = temp;
        //same for the index
        int tem = index[i+1];
        index[i+1] = index[high];
        index[high] = tem;
 
        return i+1;
    }
    
    public static int [] RANK (university arr []) {
        int rank [] = new int [1250];
        int index [] = new int [1250];
        
        for (int i = 0; i < index.length; i++) {
            rank[i] = arr[i].getRanking();
            index[i] = i;
        }
        
        quickSortRank(rank, index, 0, arr.length-1);
        
        return index;
    }
    
    public static int [] [] SUBRANK (university arr []) {
        int index [] [] = new int [22][1250];
        
        for (int i = 0; i < index.length; i++) {
            int rank [] = new int [1250];
            int indexx [] = new int [1250];
            
            for (int j = 0; j < index[0].length; j++) {
                rank[j] = arr[j].getSubRank(i);
                indexx[j] = j;
            }
            
            quickSortRank(rank, indexx, 0, arr.length-1);
            
            for (int j = 0; j < indexx.length; j++) {
                index[i][j] = indexx[j];
            }
        }
        
        
        return index;
    }
    
    public static linkNode addNode (String data, linkNode p) {
        linkNode temp = new linkNode(data);
        temp.setNext(p);
        p.setPrev(temp);
        p = temp;
        return p;
    }
    
    public static String showList (linkNode p) {
        String out =  "";
        while (p!=null) {
            out += p.getData() + "\n";
            p = p.getNext();
        }
        return out;
    } 
    
    public static String [] readMyUni () {
        String inputt;
        String listt = "";
        int posnn = 0;
        
        try {
            File inFile = new File("myUniversity.txt");
            BufferedReader in = new BufferedReader(new FileReader(inFile));
            
            if (inFile.exists() && inFile.length() != 0) {
                inputt = in.readLine();
                
                while (inputt != null) {
                    listt += inputt + "sepsep";
                    posnn++;
                    inputt = in.readLine();
                }
            in.close(); 
            }
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
        
        String list [] = listt.split("sepsep");
        return list;
    }
    
    public static void addMyUni (String data) {
        boolean exist = false;
        String temp [] = readMyUni();
        for (int i = 0; i < temp.length; i++) {
            if (data.equals(temp[i])) {
                exist = true;
            }
        }
        if (!exist) {
            head = addNode(data, head);
            try {
                PrintWriter out = new PrintWriter(new FileWriter("myUniversity.txt"));
                out.print(showList(head));
                out.close();
            } catch (java.io.IOException e) {
                System.out.println(e);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton viewGrade;
    private javax.swing.JButton viewUni;
    // End of variables declaration//GEN-END:variables
}
