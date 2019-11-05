package exercise;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2019/9/20 19:32
 */
public class img {
    public static String DEFAULT_PREVFIX = "thumb_";
    public static Boolean DEFAULT_FORCE = false;//建议该值为false

    public static void main(String[] args) {
        thumbnailImage();
    }

    /**
     * <p>Title: thumbnailImage</p>
     */
    public static void thumbnailImage() {
        //File imgFile = new File(imagePath);
        int w;
        int h;
        BufferedImage bi = null;
        try {

            // ImageIO 支持的图片类型 : [BMP, bmp, jpg, JPG, wbmp, jpeg, png, PNG, JPEG, WBMP, GIF, gif]
            String types = Arrays.toString(ImageIO.getReaderFormatNames());
            String suffix = "111--222";
            // 获取图片后缀
            File file1 = new File("C:\\Users\\tanglonglong\\Desktop\\xii");
            File[] listFiles1 = file1.listFiles();
            for (File file : listFiles1) {
                FileInputStream fileInputStream = new FileInputStream(file);
                //获取原图的输入流
                BufferedImage img = ImageIO.read(fileInputStream);
                // 根据原图与要求的缩略图比例，找到最合适的缩略图比例
                int width = img.getWidth(null);
                int height = img.getHeight(null);
                w = (width+height) / 2 * 2;
                h = w;
//                    if ((width * 1.0) / w < (height * 1.0) / h) {
//                        if (width > w) {
//                            h = Integer.parseInt(new java.text.DecimalFormat("0").format(height * w / (width * 1.0)));
//
//                        }
//                    } else {
//                        if (height > h) {
//                            w = Integer.parseInt(new java.text.DecimalFormat("0").format(width * h / (height * 1.0)));
//
//                        }
//                    }
                 bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
                Graphics g = bi.getGraphics();
                g.drawImage(img, 0, 0, w, h, Color.LIGHT_GRAY, null);
                g.dispose();
                String desc = "D:\\xi\\" + file.getName();
                // 将图片保存在原目录并加上前缀
                ImageIO.write(bi, "jpg", new File(desc));

        bi.flush();
            }
        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
