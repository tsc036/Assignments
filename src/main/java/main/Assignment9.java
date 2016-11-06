package main;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
import grail.*;
import mp.tokens.*;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Assignment9
{
	public static void main(String[] args)
	{
		Component scene= SingletonsCreator.inheritingBridgeScenePainterFactoryMethod();
		BridgeSceneControllerInterface controller=SingletonsCreator.bridgeSceneControllerFactoryMethod();
		JFrame frame=new JFrame();
		frame.add(scene);
		frame.setVisible(true);
		OEFrame o=ObjectEditor.edit(SingletonsCreator.bridgeSceneFactory());
		OEFrame o2=ObjectEditor.edit(SingletonsCreator.commandInterperterFactory());
		SingletonsCreator.bridgeSceneFactory().getArthur().move(10, 20);
		SingletonsCreator.bridgeSceneFactory().getArthur().getStringShape().setText("hey");
		SingletonsCreator.bridgeSceneFactory().getArthur().move(100, 200);
		
		
	}
}