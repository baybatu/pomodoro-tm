package ru.greeneyes.project.pomidoro;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;

/**
 * @author ivanalx
 * @date 28.04.2010 18:27:28
 */
public class PomodoroForm {
	private JProgressBar progressBar1;
	private JButton controlButton;
	private JPanel rootPanel;
	private JLabel pomodoroAmount;
	private int pomodoros;

	public JLabel getPomodorosLabel() {
		return pomodoroAmount;
	}

	public int getPomodoros() {
		return pomodoros;
	}

	public JButton getControlButton() {
		return controlButton;
	}

	public void setPomodoroAmount(int p) {
		this.pomodoros = p;
		pomodoroAmount.setText("Pomodoros: " + p);
	}

	public int getPomodoroAmount() {
		return pomodoros;
	}

	public JProgressBar getProgressBar1() {
		return progressBar1;
	}

	public JPanel getRootPanel() {
		return rootPanel;
	}

	{
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
		$$$setupUI$$$();
	}

	/**
	 * Method generated by IntelliJ IDEA GUI Designer >>> IMPORTANT!! <<< DO NOT edit this method OR call it in your code!
	 *
	 * @noinspection ALL
	 */
	private void $$$setupUI$$$() {
		rootPanel = new JPanel();
		rootPanel.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
		progressBar1 = new JProgressBar();
		progressBar1.setBorderPainted(true);
		progressBar1.setEnabled(true);
		progressBar1.setIndeterminate(false);
		progressBar1.setMaximum(0);
		progressBar1.setOrientation(0);
		progressBar1.setString("0:00");
		progressBar1.setStringPainted(true);
		progressBar1.setValue(0);
		rootPanel.add(progressBar1,
				new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
						GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0,
						false));
		final Spacer spacer1 = new Spacer();
		rootPanel.add(spacer1,
				new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1,
						GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
		final JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayoutManager(1, 5, new Insets(0, 0, 0, 0), -1, -1));
		rootPanel.add(panel1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
				GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
				GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0,
				false));
		final Spacer spacer2 = new Spacer();
		panel1.add(spacer2,
				new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
						GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
		controlButton = new JButton();
		controlButton.setIcon(new ImageIcon(getClass().getResource("/ru/greeneyes/project/pomidoro/play-icon.png")));
		controlButton.setText("Start");
		panel1.add(controlButton,
				new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
						GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
						GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
		final Spacer spacer3 = new Spacer();
		panel1.add(spacer3,
				new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
						GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
		pomodoroAmount = new JLabel();
		pomodoroAmount.setText("Pomodoro: 0");
		pomodoroAmount.setToolTipText("Click 2 times to clear pomodoros");
		panel1.add(pomodoroAmount,
				new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
						GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0,
						false));
		final Spacer spacer4 = new Spacer();
		panel1.add(spacer4,
				new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
						GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
	}

	/**
	 * @noinspection ALL
	 */
	public JComponent $$$getRootComponent$$$() {
		return rootPanel;
	}
}
