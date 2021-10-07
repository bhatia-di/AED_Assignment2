/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author 18577
 */
public class UberMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form UberMainFrame
     */
    public UberMainFrame() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UberMainTabbedFrame = new javax.swing.JTabbedPane();
        adminPanel = new javax.swing.JPanel();
        carCatalogScrollPane = new javax.swing.JScrollPane();
        carCatalogTable = new javax.swing.JTable();
        formHeaderLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        createUpdateScrollablePanel = new javax.swing.JScrollPane();
        createUpdateViewForm = new javax.swing.JPanel();
        modelNameLabel = new javax.swing.JLabel();
        manufacturerNameLabel = new javax.swing.JLabel();
        availabilityLabel = new javax.swing.JLabel();
        availabiityTimestampLabel = new javax.swing.JLabel();
        manufacturedTimestampLabel = new javax.swing.JLabel();
        numberOfSeatsLabel = new javax.swing.JLabel();
        serialNumberLabel = new javax.swing.JLabel();
        maintenanceTimestampLabel = new javax.swing.JLabel();
        modelNameTextField = new javax.swing.JTextField();
        isAvailableCheckbox = new javax.swing.JCheckBox();
        availableYearCombobox = new javax.swing.JComboBox<>();
        availableMonthCombobox1 = new javax.swing.JComboBox<>();
        manufacturerNameTextField = new javax.swing.JTextField();
        numberOfSeatsTextField = new javax.swing.JTextField();
        serialNumberTextField = new javax.swing.JTextField();
        saveChangesButton = new javax.swing.JButton();
        addressPanel = new javax.swing.JPanel();
        zipCodeTextField = new javax.swing.JTextField();
        stateLabel = new javax.swing.JLabel();
        streetAddressTextField = new javax.swing.JTextField();
        addressTextField2 = new javax.swing.JTextField();
        zipCodeLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        manufacturedYearCombobox = new javax.swing.JComboBox<>();
        manufacturedMonthCombobox = new javax.swing.JComboBox<>();
        expiryDateTextField = new javax.swing.JTextField();
        expiryYearCombobox = new javax.swing.JComboBox<>();
        expiryMonthCombobox = new javax.swing.JComboBox<>();
        manufacturedDateComboBox = new javax.swing.JComboBox<>();
        availableDateComboBox = new javax.swing.JComboBox<>();
        carCatalogHeaderLabel1 = new javax.swing.JLabel();
        searchPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UberMainTabbedFrame.setForeground(new java.awt.Color(0, 0, 102));
        UberMainTabbedFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UberMainTabbedFrame.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        adminPanel.setAutoscrolls(true);
        adminPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        carCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Model Name", "Availabilty", "Available time", "Manufacturer Name", "Manufacturer time", "Number of seats", "Serial Number", "Address", "Maintenace Expiry Timestamp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        carCatalogScrollPane.setViewportView(carCatalogTable);

        formHeaderLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        formHeaderLabel.setForeground(new java.awt.Color(0, 0, 102));
        formHeaderLabel.setText(" ");

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        viewButton.setText("View ");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        createUpdateViewForm.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        createUpdateViewForm.setAutoscrolls(true);

        modelNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        modelNameLabel.setText("Model Name :");

        manufacturerNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        manufacturerNameLabel.setText("Manufacturer Name:");

        availabilityLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        availabilityLabel.setText("Is Available?");

        availabiityTimestampLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        availabiityTimestampLabel.setText("Available Timestamp:");

        manufacturedTimestampLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        manufacturedTimestampLabel.setText("Manufactured Timestamp:");

        numberOfSeatsLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numberOfSeatsLabel.setText("Number of Seats: ");

        serialNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        serialNumberLabel.setText("Serial Number: ");

        maintenanceTimestampLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        maintenanceTimestampLabel.setText("Maintenance Expiry Timestamp: ");

        modelNameTextField.setText(" ");

        isAvailableCheckbox.setText("Yes");
        isAvailableCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isAvailableCheckboxActionPerformed(evt);
            }
        });

        availableYearCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));

        availableMonthCombobox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        manufacturerNameTextField.setText(" ");

        numberOfSeatsTextField.setText(" ");

        serialNumberTextField.setText(" ");

        saveChangesButton.setText("Save");

        addressPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        addressPanel.setAutoscrolls(true);

        zipCodeTextField.setText(" ");

        stateLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stateLabel.setText("State:");

        streetAddressTextField.setText(" ");

        addressTextField2.setText(" ");

        zipCodeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        zipCodeLabel.setText("Zip Code:");

        cityLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cityLabel.setText("City:");

        cityTextField.setText(" ");

        addressLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addressLabel.setText("Street Address:");

        javax.swing.GroupLayout addressPanelLayout = new javax.swing.GroupLayout(addressPanel);
        addressPanel.setLayout(addressPanelLayout);
        addressPanelLayout.setHorizontalGroup(
            addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addGroup(addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zipCodeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(cityTextField)
                    .addComponent(addressTextField2)
                    .addComponent(streetAddressTextField))
                .addGap(116, 116, 116))
        );
        addressPanelLayout.setVerticalGroup(
            addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel))
                .addGroup(addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addressPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(cityLabel)
                        .addGap(23, 23, 23)
                        .addGroup(addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zipCodeLabel)
                            .addComponent(zipCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addressPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateLabel)
                    .addComponent(addressTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        manufacturedYearCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));

        manufacturedMonthCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        expiryDateTextField.setText(" ");

        expiryYearCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));

        expiryMonthCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        manufacturedDateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "31" }));

        availableDateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "31" }));

        javax.swing.GroupLayout createUpdateViewFormLayout = new javax.swing.GroupLayout(createUpdateViewForm);
        createUpdateViewForm.setLayout(createUpdateViewFormLayout);
        createUpdateViewFormLayout.setHorizontalGroup(
            createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createUpdateViewFormLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveChangesButton)
                    .addGroup(createUpdateViewFormLayout.createSequentialGroup()
                        .addComponent(maintenanceTimestampLabel)
                        .addGap(61, 61, 61)
                        .addComponent(expiryDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(expiryMonthCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(expiryYearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(serialNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(createUpdateViewFormLayout.createSequentialGroup()
                        .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availabilityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manufacturerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manufacturedTimestampLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberOfSeatsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availabiityTimestampLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createUpdateViewFormLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(serialNumberTextField)
                                    .addComponent(manufacturerNameTextField)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(modelNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(isAvailableCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(createUpdateViewFormLayout.createSequentialGroup()
                                            .addComponent(availableDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(availableMonthCombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(availableYearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(numberOfSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createUpdateViewFormLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(manufacturedDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(manufacturedMonthCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(manufacturedYearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(486, Short.MAX_VALUE))
        );
        createUpdateViewFormLayout.setVerticalGroup(
            createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createUpdateViewFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modelNameTextField)
                    .addComponent(modelNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isAvailableCheckbox)
                    .addComponent(availabilityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(availabiityTimestampLabel)
                    .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(availableMonthCombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(availableYearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(availableDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manufacturerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manufacturerNameLabel))
                .addGap(30, 30, 30)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufacturedTimestampLabel)
                    .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(manufacturedYearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(manufacturedDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(manufacturedMonthCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfSeatsLabel)
                    .addComponent(numberOfSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serialNumberLabel)
                    .addComponent(serialNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintenanceTimestampLabel)
                    .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(expiryDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(expiryYearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(expiryMonthCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(saveChangesButton)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        createUpdateScrollablePanel.setViewportView(createUpdateViewForm);

        carCatalogHeaderLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        carCatalogHeaderLabel1.setForeground(new java.awt.Color(0, 0, 102));
        carCatalogHeaderLabel1.setText("Car Catalog");

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addComponent(formHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createButton)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton)
                        .addGap(18, 18, 18)
                        .addComponent(viewButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton))
                    .addComponent(carCatalogScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
            .addComponent(createUpdateScrollablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1286, Short.MAX_VALUE)
            .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adminPanelLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(carCatalogHeaderLabel1)
                    .addContainerGap(1138, Short.MAX_VALUE)))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(carCatalogScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(viewButton)
                    .addComponent(createButton)
                    .addComponent(formHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createUpdateScrollablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                .addGap(76, 76, 76))
            .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adminPanelLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(carCatalogHeaderLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1223, Short.MAX_VALUE)))
        );

        UberMainTabbedFrame.addTab("Admin", adminPanel);

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1286, Short.MAX_VALUE)
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1275, Short.MAX_VALUE)
        );

        UberMainTabbedFrame.addTab("Search", searchPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UberMainTabbedFrame)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UberMainTabbedFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 1316, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader(" ");

    }//GEN-LAST:event_viewButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader(" ");

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader("Update details to for below Car record & hit save.");

    }//GEN-LAST:event_updateButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader("Add details to create a Car record.");
        
    }//GEN-LAST:event_createButtonActionPerformed

    private void isAvailableCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isAvailableCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isAvailableCheckboxActionPerformed
    
    private void updateAdminHeader(String text) {
        formHeaderLabel.setText(text);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UberMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UberMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UberMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UberMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UberMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane UberMainTabbedFrame;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JPanel addressPanel;
    private javax.swing.JTextField addressTextField2;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JLabel availabiityTimestampLabel;
    private javax.swing.JLabel availabilityLabel;
    private javax.swing.JComboBox<String> availableDateComboBox;
    private javax.swing.JComboBox<String> availableMonthCombobox1;
    private javax.swing.JComboBox<String> availableYearCombobox;
    private javax.swing.JLabel carCatalogHeaderLabel1;
    private javax.swing.JScrollPane carCatalogScrollPane;
    private javax.swing.JTable carCatalogTable;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JButton createButton;
    private javax.swing.JScrollPane createUpdateScrollablePanel;
    private javax.swing.JPanel createUpdateViewForm;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField expiryDateTextField;
    private javax.swing.JComboBox<String> expiryMonthCombobox;
    private javax.swing.JComboBox<String> expiryYearCombobox;
    private javax.swing.JLabel formHeaderLabel;
    private javax.swing.JCheckBox isAvailableCheckbox;
    private javax.swing.JLabel maintenanceTimestampLabel;
    private javax.swing.JComboBox<String> manufacturedDateComboBox;
    private javax.swing.JComboBox<String> manufacturedMonthCombobox;
    private javax.swing.JLabel manufacturedTimestampLabel;
    private javax.swing.JComboBox<String> manufacturedYearCombobox;
    private javax.swing.JLabel manufacturerNameLabel;
    private javax.swing.JTextField manufacturerNameTextField;
    private javax.swing.JLabel modelNameLabel;
    private javax.swing.JTextField modelNameTextField;
    private javax.swing.JLabel numberOfSeatsLabel;
    private javax.swing.JTextField numberOfSeatsTextField;
    private javax.swing.JButton saveChangesButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JLabel serialNumberLabel;
    private javax.swing.JTextField serialNumberTextField;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField streetAddressTextField;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    private javax.swing.JLabel zipCodeLabel;
    private javax.swing.JTextField zipCodeTextField;
    // End of variables declaration//GEN-END:variables
}
