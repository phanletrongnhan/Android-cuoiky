package com.example.banglaixe.Tubycastu;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.banglaixe.Object.question;

import com.example.banglaixe.Object.Category;


import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SatHachDbHelper extends SQLiteOpenHelper {
    private static final String DatabaseName = "SatHach.db";
    private static final int DatabaseVersion = 1;

    private static SatHachDbHelper instance;

    private SQLiteDatabase db;

    public SatHachDbHelper( Context context) {
        super(context, DatabaseName, null, DatabaseVersion);
    }

    public static synchronized SatHachDbHelper getInstance(Context context){
        if(instance == null){
            instance = new SatHachDbHelper(context.getApplicationContext());
        }
        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SqlCreateCategoryTable = "CREATE TABLE " +
                SatHachContract.CategoriesTable.Table_Name+ " ( " +
                SatHachContract.CategoriesTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                SatHachContract.CategoriesTable.ColumnName + " TEXT " +
                " ) ";
        final String SqlCreateQuestion = "CREATE TABLE " +
                SatHachContract.QuestionTable.Table_Name+ " ( " +
                SatHachContract.QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                SatHachContract.QuestionTable.COLUMN_QUESTION + " TEXT, " +
                SatHachContract.QuestionTable.COLUMN_OPTION1 + " TEXT, " +
                SatHachContract.QuestionTable.COLUMN_OPTION2 + " TEXT, " +
                SatHachContract.QuestionTable.COLUMN_OPTION3 + " TEXT, " +
                SatHachContract.QuestionTable.COLUMN_AMSWER + " INTEGER, " +
                SatHachContract.QuestionTable.COLUMN_CATEGORY_ID + " INTEGER, " +
                "FOREIGN KEY(" + SatHachContract.QuestionTable.COLUMN_CATEGORY_ID + ") REFERENCES " +
                SatHachContract.CategoriesTable.Table_Name + "(" + SatHachContract.CategoriesTable._ID + ")" + "ON DELETE CASCADE" +
                " ) ";

        db.execSQL(SqlCreateCategoryTable);
        db.execSQL(SqlCreateQuestion);
        fillCategoryTable();
        fillQuestionTable();

    }

    private void fillCategoryTable() {
        Category c1 = new Category("ĐỀ 1");
        addCategory(c1);
        Category c2 = new Category("ĐỀ 2");
        addCategory(c2);
        Category c3 = new Category("ĐỀ 3");
        addCategory(c3);
    }

    private void addCategory(Category category) {
        ContentValues cv  = new ContentValues();
        cv.put(SatHachContract.CategoriesTable.ColumnName, category.getName());
        db.insert(SatHachContract.CategoriesTable.Table_Name,null,cv);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + SatHachContract.CategoriesTable.Table_Name);
        db.execSQL("DROP TABLE IF EXISTS " + SatHachContract.QuestionTable.Table_Name);
        onCreate(db);
    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
        db.setForeignKeyConstraintsEnabled(true);
    }

    private void fillQuestionTable() {
        question q1 = new question("ĐỀ 1 : Khái niệm 'đường bộ' được hiểu như thế nào là đúng?" , "Đường bộ, cầu đường bộ", "Hầm đường bộ, bến phà", "Đường, Cầu đường bộ, Hầm đường bộ", 1,Category.DE1);
        insertQuestion(q1);
        question q2 = new question("ĐỀ 1 : 'Vạch kẻ đường' được hiểu như thế nào là đúng?" , "Vạch kẻ đường là vạch chỉ sự phân chia làn đường, vị trí hoặc hướng đi, vị trí dừng lại", "là cạch chỉ sự phân biệt vị trí dừng, đỗ trên vạch đường", "Tất cả các ý trên", 1,Category.DE1);
        insertQuestion (q2);
        question q3 = new question("ĐỀ 1 : Khái niệm 'phần đường xe chạy' được hiểu như thế nào là đúng ?" , "là phần đường bộ được sử dụng cho các phương tiện giao thông qua lại.", "dải đất dọc 2 bên đường để đảm bảo an toàn giao thông", "tất cả các ý trên", 1,Category.DE1);
        insertQuestion (q3);
        question q4 = new question("ĐỀ 1 : Khái niệm 'làn đường' được hiểu như thế nào là đúng?" , "là một phần đường được chia theo chiều ngang của đường", "là một phần đường xe chạy được chia theo chiều dọc của đường", "cả 2 ý trên", 2,Category.DE1);
        insertQuestion (q4);
        question q5 = new question("ĐỀ 1 : Khái niệm đường phố được hiểu như nào là đúng?" , "Đường phố là đô thị gồm lòng đường và hè phố", "Đường phố là đường ngoài đô thị có lòng đường đủ rộng cho phương tiện qua lại", "cả 2 ý trên", 1,Category.DE1);
        insertQuestion (q5);
        question q6 = new question("ĐỀ 1 : Khái niệm dải phân cách được hiểu như nào là đúng?" , "là bộ phận của đường để phân chia mặt đường thành 2 chiều xe chạy riêng biệt", "là bộ phận của đường để xác địch ranh giới của đất dành cho người đi bộ theo chiều ngang", "là bộ phận phân cách để ngăn không cho xe vào những nơi không được phép", 1,Category.DE1);
        insertQuestion (q6);
        question q7 = new question("ĐỀ 1 : Giải phân cách trên đường bộ có những loại nào?" , "loại cố định", "loại di động", "cả 2 ý trên", 3,Category.DE1);
        insertQuestion (q7);
        question q8 = new question("ĐỀ 1 : Phương tiện giao thông đường bộ gồm những loại nào?" , "Phương tiện giao thông cơ giới đường bộ, phương tiện giao thôgn thô sơ đường bộ", "Phương tiện giao thông cơ giới đường bộ, phương tiện giao thôgn thô sơ đường bộ và xe máy chuyên dụng", "cả 2 ý trên", 1,Category.DE1);
        insertQuestion (q8);
        question q9 = new question("ĐỀ 1 : Người tham gia giao thông đường bộ gồm những đối tượng nào?" , "Người điều khiển, người sử dụng phương tiện tham gia giao thông đường bộ", "Người điều khiển, dẫn dắt súc vật, người đi bộ trên đường bộ", "cả 2 ý trên", 3,Category.DE1);
        insertQuestion (q9);
        question q10 = new question("ĐỀ 1 : Khái niệm người điều khiển giao thông được hiểu như thế nào là đúng?" , "Là người điều khiển phương tiện tham gia giao thông", "là người được giao nhiệm vụ hướng dẫn giao thông", "là cảnh sát giao thông", 2,Category.DE1);
        insertQuestion (q10);
        question q11 = new question("ĐỀ 1 : Những hành vi nào sau đây bị nghiêm cấm?" , "Đua xe, cổ vũ đua xe , tổ chức đua xe", "lạng lách đánh võng", "cả 2 ý trên", 3,Category.DE1);
        insertQuestion (q11);
        question q12 = new question("ĐỀ 1 : Người điều khiển giao thông đường bộ mà trong cơ thể có chất ma túy có bị nghiêm cấm hay không?" , "Không bị nghiêm cấm", "Bị nghiêm cấm", "...", 2,Category.DE1);
        insertQuestion (q12);

        //add đề 2
        question q13 = new question("ĐỀ 1 : Người điều khiển xe mô tô, gắn mát trong máu có nồng độ cồn vượt quá bao nhiêu thì bị cấm?" , "Nồng độ cồn vượt quá 30miligam/100mililit máu", "Nồng độ cồn vượt quá 40miligam/100mililit máu", "Nồng độ cồn vượt quá 50miligam/100mililit máu", 1,Category.DE2);
        insertQuestion (q13);
        question q14 = new question("ĐỀ 1 : Hành vi bỏ trốn sau khi gây tai nạn để trốn tránh trách nhiệm có bị nghiêm cấm không?" , "Không bị nghiêm cấm", "Nghiêm cấm tùy trường hợp cụ thể", "Bị nghiêm cấm", 3,Category.DE2);
        insertQuestion (q14);
        question q15 = new question("ĐỀ 1 : Bảo đảm an toàn trật tự giao thông đường bộ là trách nhiệm của ai?" , "Là trách nhiệm của ngành giao thông vận tải", "Là trách nhiệm của cơ quan, tổ chức, cá nhân", "Là trách nhiệm của cảnh sát giao thông", 2,Category.DE2);
        insertQuestion (q15);
        question q16 = new question("ĐỀ 2 : Hành vi điều khiển xe cơ giới chạy quá tốc độ quy định, giành đường có bị nghiêm cấm hay không" , "Không nghiêm cấm", "Bị nghiêm cấm", "Bị nghiêm cấm tùy trường hợp", 2,Category.DE2);
        insertQuestion (q16);
        question q17 = new question("ĐỀ 2 : những hành vi nào sau đây bị cấm" , "bấm còi rú ga liên tục", "Bấm còi hơi sử dụng đèn chiếu xa trong khu đô thị và khu dân cư", "Cả 2 ý kiến trên", 3,Category.DE2);
        insertQuestion (q17);
        question q18 = new question("ĐỀ 2 : Tại nơi có biển báo hiệu cố định lại có biển báo hiệu tạm thời thì người tham gia p chấm hành hiệu lệnh nào" , "Biển báo hiệu cố định", "Biển báo hiệu tạm thời", "Cả 2 biển báo trên", 2,Category.DE2);
        insertQuestion (q18);
        question q19 = new question("ĐỀ 2 : Người ngồi trên mô tô 2 bánh ,3 bánh và xe gắn máy khi tham gia giao thông có được mang vác vật cồng kềnh hay không?" , "Được", "Không được", "được mang nhưng phải đảm bảo an toàn", 2,Category.DE2);
        insertQuestion (q19);
        question q20 = new question("ĐỀ 2 : Người ngồi trên mô tô 2 bánh ,3 bánh và xe gắn máy khi tham gia giao thông không được thực hiện hành vi nào sau đây?" , "Đội mũ bảo hiểm và cài quai đúng cách", "Sử dụng ô kéo theo các phương tiện khác", "cả 2 ý trên", 2,Category.DE2);
        insertQuestion (q20);
        question q21 = new question("ĐỀ 2 : Người ngồi trên mô tô 2 bánh ,3 bánh và xe gắn máy khi tham gia giao thông có được phép sử dụng xe để kéo đẩy các xe khác?" , "Được phép", "Tùy trường hợp", "Không được phép", 3,Category.DE2);
        insertQuestion (q21);
        question q22 = new question("ĐỀ 2 : Các hành vi nào sau đây bị nghiêm cấm?" , "Lắp đặt sử dụng đèn còi không đúng thiết kế của nhà sản xuất", "sử dụng thiết bị âm thanh gây mất trật tự an toàn giao thông, trật tự cộng đồng", "Cả 2 ý trên", 3,Category.DE2);
        insertQuestion (q22);

        //add đề 3
        question q23 = new question("ĐỀ 3 : Khái niệm 'phần đường xe chạy' được hiểu như thế nào là đúng ?" , "là phần đường bộ được sử dụng cho các phương tiện giao thông qua lại.", "dải đất dọc 2 bên đường để đảm bảo an toàn giao thông", "tất cả các ý trên", 1,Category.DE3);
        insertQuestion (q23);
        question q24 = new question("ĐỀ 3 : Người ngồi trên mô tô 2 bánh ,3 bánh và xe gắn máy khi tham gia giao thông có được phép sử dụng xe để kéo đẩy các xe khác?" , "Được phép", "Tùy trường hợp", "Không được phép", 3,Category.DE3);
        insertQuestion (q24);
        question q25 = new question("ĐỀ 3 : Tại nơi có biển báo hiệu cố định lại có biển báo hiệu tạm thời thì người tham gia p chấm hành hiệu lệnh nào" , "Biển báo hiệu cố định", "Biển báo hiệu tạm thời", "Cả 2 biển báo trên", 2,Category.DE3);
        insertQuestion (q25);
        question q26 = new question("ĐỀ 3 : Hành vi bỏ trốn sau khi gây tai nạn để trốn tránh trách nhiệm có bị nghiêm cấm không?" , "Không bị nghiêm cấm", "Nghiêm cấm tùy trường hợp cụ thể", "Bị nghiêm cấm", 3,Category.DE3);
        insertQuestion (q26);
        question q27 = new question("ĐỀ 3 : Các hành vi nào sau đây bị nghiêm cấm?" , "Lắp đặt sử dụng đèn còi không đúng thiết kế của nhà sản xuất", "sử dụng thiết bị âm thanh gây mất trật tự an toàn giao thông, trật tự cộng đồng", "Cả 2 ý trên", 3,Category.DE3);
        insertQuestion (q27);
        question q28 = new question("ĐỀ 3 : Những hành vi nào sau đây bị nghiêm cấm?" , "Đua xe, cổ vũ đua xe , tổ chức đua xe", "lạng lách đánh võng", "cả 2 ý trên", 3,Category.DE3);
        insertQuestion (q28);
    }





    private void insertQuestion(question Question){
        ContentValues cv = new ContentValues();
        cv.put(SatHachContract.QuestionTable.COLUMN_QUESTION, Question.getQuestion());
        cv.put(SatHachContract.QuestionTable.COLUMN_OPTION1, Question.getOption1());
        cv.put(SatHachContract.QuestionTable.COLUMN_OPTION2, Question.getOption2());
        cv.put(SatHachContract.QuestionTable.COLUMN_OPTION3, Question.getOption3());
        cv.put(SatHachContract.QuestionTable.COLUMN_AMSWER, Question.getAnswer());
        cv.put(SatHachContract.QuestionTable.COLUMN_CATEGORY_ID, Question.getCategoryID());
        db.insert(SatHachContract.QuestionTable.Table_Name , null ,cv);
    }

    public List<Category> getAllCategories(){
        List<Category> categoryList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + SatHachContract.CategoriesTable.Table_Name, null);

        if(c.moveToFirst()){
            do{
                Category category= new Category();
                category.setId(c.getInt(c.getColumnIndex(SatHachContract.CategoriesTable._ID)));
                category.setName(c.getString(c.getColumnIndex(SatHachContract.CategoriesTable.ColumnName)));
                categoryList.add(category);
            }while (c.moveToNext());
        }

        c.close();
        return categoryList;
    }



    public ArrayList<question> getAllQuestion(){
        ArrayList<question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM "+ SatHachContract.QuestionTable.Table_Name , null);

        if( c.moveToFirst()){
            do{
                question question = new question();
                question.setId(c.getInt(c.getColumnIndex(SatHachContract.QuestionTable._ID)));
                question.setQuestion(c.getString(c.getColumnIndex(SatHachContract.QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(SatHachContract.QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(SatHachContract.QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(SatHachContract.QuestionTable.COLUMN_OPTION3)));
                question.setAnswer(c.getInt(c.getColumnIndex(SatHachContract.QuestionTable.COLUMN_AMSWER)));
                question.setCategoryID(c.getInt(c.getColumnIndex(SatHachContract.QuestionTable.COLUMN_CATEGORY_ID)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }

    public ArrayList<question> getQuestions(int categoryID){
        ArrayList<question> questionsList =new ArrayList<>();
        db = getReadableDatabase();
        String selestion = SatHachContract.QuestionTable.COLUMN_CATEGORY_ID + " = ? ";
        String[] selectionArgs = new String[]{String.valueOf(categoryID)};
        Cursor c = db.query(
                SatHachContract.QuestionTable.Table_Name,
                null,
                selestion,
                selectionArgs,
                null,
                null,
                null
        );

        if(c.moveToFirst()){
            do{
                question question = new question();
                question.setId(c.getInt(c.getColumnIndex(SatHachContract.QuestionTable._ID)));
                question.setQuestion(c.getString(c.getColumnIndex(SatHachContract.QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(SatHachContract.QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(SatHachContract.QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(SatHachContract.QuestionTable.COLUMN_OPTION3)));
                question.setAnswer(c.getInt(c.getColumnIndex(SatHachContract.QuestionTable.COLUMN_AMSWER)));
                question.setCategoryID(c.getInt(c.getColumnIndex(SatHachContract.QuestionTable.COLUMN_CATEGORY_ID)));
                questionsList.add(question);
            }while (c.moveToNext());
        }
        c.close();
        return questionsList;
    }
}
