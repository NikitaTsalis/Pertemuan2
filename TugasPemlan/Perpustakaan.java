package TugasPemlan;

public class Perpustakaan {
    public String[][] Teknologi = {
            {"A Hands-On, Project-Based Introduction to Programming", "Eric Matthes", "544", "No Starch Press", "2019"},
            {"A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "464", "Prentice Hall", "2008"},
            {"The Lean Startup", "Eric Ries", "336", "Crown Business", "2011"},
            {"An Integrated Approach to Online Marketing", "Simon Kingsnorth", "400", "Kogan Page", "2023"},
            {"189 Programming Questions and Solutions", "Gayle McDowell", "687", "CareerCup", "2019"}
    };
        
    public String[][] Filsafat = {
            {"A Brief History of Humankind", "Yuval Noah Harari", "443", "Harper", "2015"},
            {"A Counterintuitive Approach", "Mark Manson", "224", "HarperOne", "2016"},
            {"Thinking, Fast and Slow", "Daniel Kahneman", "499", "Farrar, Straus and Giroux", "2011"},
            {"Man's Search for Meaning", "Viktor E. Frankl", "184", "Beacon Press", "2006"},
            {"Meditations", "Marcus Aurelius", "256", "Penguin Classics", "2014"}
    };
        
    public String[][] Sejarah = {
            {"Educated: A Memoir", "Tara Westover", "334", "Random House", "2018"},
            {"1491: New Revelations of the Americas Before Columbus", "Charles C. Mann", "541", "Vintage Books", "2005"},
            {"Nine Americans and Their Epic Quest for Gold", "Daniel James Brown", "404", "Penguin Books", "2013"},
            {"A Short History of Nearly Everything", "Bill Bryson", "544", "Broadway Books", "2003"},
            {"Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "443", "Harper", "2015"}
    };
        
    public String[][] Agama = {
            {"The Power of Now: A Guide to Spiritual Enlightenment", "Eckhart Tolle", "236", "New World Library", "1997"},
            {"A Practical Guide to Personal Freedom", "Don Miguel Ruiz", "160", "Amber-Allen Publishing", "1997"},
            {"The Celestine Prophecy: An Adventure", "James Redfield", "246", "Warner Books", "1993"},
            {"Mindfulness Meditation in Everyday Life", "Jon Kabat-Zinn", "304", "Hyperion", "1994"},
            {"The Alchemist", "Paulo Coelho", "197", "HarperOne", "1988"}
    };
        
    public String[][] Psikologi = {
            {"The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", "352", "Crown Publishing Group", "2012"},
            {"Brain, Mind, and Body in the Healing of Trauma", "Bessel van der Kolk", "464", "Penguin Books", "2014"},
            {"Thinking, Fast and Slow", "Daniel Kahneman", "499", "Farrar, Straus and Giroux", "2011"},
            {"Man's Search for Meaning", "Viktor E. Frankl", "184", "Beacon Press", "2006"},
            {"An Easy & Proven Way to Build Good Habits", "James Clear", "320", "Avery", "2018"}
    };
        
    public String[][] Politik = {
            {"The Art of War", "Sun Tzu", "94", "Wilder Publications", "2009"},
            {"The Prince", "Niccolò Machiavelli", "140", "CreateSpace IPP", "2010"},
            {"How to Win Friends & Influence People", "Dale Carnegie", "288", "Gallery Books", "2009"},
            {"The 48 Laws of Power", "Robert Greene", "452", "Penguin Books", "2000"},
            {"The Federalist Papers", "Alexander Hamilton", "432", "Signet Classics", "2003"}
    };
        
    public String[][] Fiksi = {
            {"The Night Circus", "Erin Morgenstern", "528", "Anchor Books", "2012"},
            {"The Book Thief", "Markus Zusak", "552", "Knopf", "2005"},
            {"To Kill a Mockingbird", "Harper Lee", "323", "Grand Central Publishing", "2010"},
            {"The Great Gatsby", "F. Scott Fitzgerald", "200", "Scribner", "2014"},
            {"The Catcher in the Rye", "J.D. Salinger", "277", "Back Bay Books", "2001"}  
    };

    public void showType(String[][] books, String genre) {
        System.out.println("\nDaftar Buku " + genre + ":\n");
        System.out.printf("+-------------------------------------------------------------------------------------------------------------------------+\n");
        System.out.printf("| %-50s | %-20s | %-10s | %-20s | %-20s |\n", "Judul", "Penulis", "Pages ", "Penerbit", "Tahun Terbit");
        System.out.printf("+-------------------------------------------------------------------------------------------------------------------------+\n");
        for (String[] book : books) {
            System.out.printf("| %-50s | %-20s | %-10s | %-20s | %-20s |\n", book[0], book[1], book[2], book[3], book[4]);
        }
        System.out.printf("+-------------------------------------------------------------------------------------------------------------------------+\n");
    }
    
}
