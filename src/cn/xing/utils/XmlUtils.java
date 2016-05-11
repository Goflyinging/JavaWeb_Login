package cn.xing.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;


public class XmlUtils {
	private static String filepath;
	static{
		filepath=XmlUtils.class.getClassLoader().getResource("users.xml").getPath();
	}
	//得到 Document对象
	public static Document getDocument() throws DocumentException {
		SAXReader reader = new SAXReader();
        Document document = reader.read(new File(filepath));
        return document;
	}
	//向XML 文件中写入数据
	public static void write2Xml(Document document) throws IOException{
		OutputFormat format = OutputFormat.createPrettyPrint();  //创建一个美化的格式
        format.setEncoding("UTF-8");  //文件编码
        XMLWriter writer = new XMLWriter(new FileOutputStream(filepath), format );
        writer.write(document);
        writer.close();

	}
	

}
