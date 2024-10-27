/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.Booking_BUS;
import BUS.Brands_BUS;
import BUS.Cars_BUS;
import BUS.Locations_BUS;
import BUS.Customers_BUS;
import DTO.Booking_DTO;
import DTO.Cars_DTO;
import DTO.Customers_DTO;
import java.awt.Color;
import java.awt.Image;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author ADMIN
 */
public class MenuForm extends javax.swing.JFrame {

    /**
     * Creates new form MenuForm
     */
    
    Border white_border = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white);
    Border empty_border = BorderFactory.createEmptyBorder();
    Brands_BUS brandBus = new Brands_BUS();
    Cars_BUS carsBus = new Cars_BUS();
//  Locations_BUS locationBus = new Locations_BUS();
    Booking_BUS bookingBus = new Booking_BUS();
    Customers_BUS customerBus = new Customers_BUS();
    
    ArrayList<Cars_DTO> cars_list = carsBus.getAllCars();
    ArrayList<Booking_DTO> booking_list = bookingBus.bookingList();
    ArrayList<Customers_DTO> customers_list = customerBus.getAllCustomers();
    
    private javax.swing.JFrame currentOpenGUI = null;
    public MenuForm() {
        initComponents();
        
        //center the form
        this.setLocationRelativeTo(null);
        
        //set borders
        jLabel_brands.setBorder(empty_border);
        jLabel_car.setBorder(empty_border);
        jLabel_locations.setBorder(empty_border);
        jLabel_customer.setBorder(empty_border);
        jLabel_BookACar.setBorder(empty_border);
        jLabel_users.setBorder(empty_border);
        
        jLabel_cars_count.setText(String.valueOf(cars_list.size()));
        jLabel_customers_count.setText(String.valueOf(customers_list.size()));
        jLabel_booked_count.setText(String.valueOf(booking_list.size()));
    }
    
    public void hideUserLabel() {
        jLabel_users.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_brands = new javax.swing.JLabel();
        jLabel_car = new javax.swing.JLabel();
        jLabel_locations = new javax.swing.JLabel();
        jLabel_customer = new javax.swing.JLabel();
        jLabel_BookACar = new javax.swing.JLabel();
        jLabel_users = new javax.swing.JLabel();
        jLabel_logout = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel_cars_logo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_cars_count = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel_customers_logo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel_customers_count = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel_booked_logo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel_booked_count = new javax.swing.JLabel();
        jLabel_userProfilePic = new javax.swing.JLabel();
        jLabel_username = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel_brands.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel_brands.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_brands.setText("Brand");
        jLabel_brands.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_brands.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_brandsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_brandsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_brandsMouseExited(evt);
            }
        });

        jLabel_car.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel_car.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_car.setText("Car");
        jLabel_car.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_car.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_carMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_carMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_carMouseExited(evt);
            }
        });

        jLabel_locations.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel_locations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_locations.setText("Location");
        jLabel_locations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_locations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_locationsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_locationsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_locationsMouseExited(evt);
            }
        });

        jLabel_customer.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel_customer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_customer.setText("Customer");
        jLabel_customer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_customerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_customerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_customerMouseExited(evt);
            }
        });

        jLabel_BookACar.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel_BookACar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_BookACar.setText("Book a Car");
        jLabel_BookACar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_BookACar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BookACarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_BookACarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_BookACarMouseExited(evt);
            }
        });

        jLabel_users.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel_users.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_users.setText("Users");
        jLabel_users.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_usersMouseExited(evt);
            }
        });

        jLabel_logout.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel_logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_logout.setText("Log out");
        jLabel_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_logoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_users, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_BookACar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_locations, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_car, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_brands, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel_brands, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel_car, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel_locations, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel_BookACar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel_users, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(jLabel_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jLabel_close.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_close.setText("X");
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 178, 41));

        jPanel5.setBackground(new java.awt.Color(246, 145, 16));

        jLabel_cars_logo.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel_cars_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car-30984_640.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cars");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel_cars_logo)
                .addGap(49, 49, 49))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_cars_logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );

        jLabel_cars_count.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel_cars_count.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cars_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_cars_count.setText("100");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel_cars_count, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_cars_count, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(75, 192, 18));

        jPanel7.setBackground(new java.awt.Color(65, 160, 10));

        jLabel_customers_logo.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel_customers_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/call-center-7374023_640.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Customers");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_customers_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_customers_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel_customers_count.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel_customers_count.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_customers_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_customers_count.setText("100");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel_customers_count, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_customers_count, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(155, 89, 182));

        jPanel9.setBackground(new java.awt.Color(125, 60, 155));
        jPanel9.setPreferredSize(new java.awt.Dimension(271, 101));

        jLabel_booked_logo.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel_booked_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar-1763587_640.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Booked");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel_booked_logo)
                .addGap(17, 17, 17))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_booked_logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel_booked_count.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel_booked_count.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_booked_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_booked_count.setText("100");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel_booked_count, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_booked_count, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_username.setText("Loged user username");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_userProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel_username, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_userProfilePic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_username, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))))
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void displayImage (int width, int height, String image_path, JLabel label)
    {
        // get the image
        ImageIcon imageIco = new ImageIcon(getClass().getResource(image_path));
        //resize the image
        Image image = imageIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // set the image into the flabel
        label.setIcon(new ImageIcon(image));
    }
    
    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_brandsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_brandsMouseClicked
        if (currentOpenGUI != null) {
            currentOpenGUI.dispose();
        }
        
        Brands_GUI brd_gui = new Brands_GUI();
        brd_gui.setVisible(true);
        currentOpenGUI = brd_gui;
    }//GEN-LAST:event_jLabel_brandsMouseClicked

    private void jLabel_locationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_locationsMouseClicked
        try {
            if (currentOpenGUI != null) {
                currentOpenGUI.dispose();
            }
            Locations_GUI lct_gui = new Locations_GUI();
            lct_gui.setVisible(true);
            currentOpenGUI = lct_gui;
        } catch (Exception ex) {
            Logger.getLogger(MenuForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel_locationsMouseClicked

    private void jLabel_carMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_carMouseClicked
        if (currentOpenGUI != null) {
            currentOpenGUI.dispose();
        }
        
        Cars_GUI car_gui = new Cars_GUI();
        car_gui.setVisible(true);
        currentOpenGUI = car_gui;
    }//GEN-LAST:event_jLabel_carMouseClicked

    private void jLabel_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_customerMouseClicked
        if (currentOpenGUI != null) {
            currentOpenGUI.dispose();
        }
        
        Customers_GUI cus_gui = new Customers_GUI();
        cus_gui.setVisible(true);
        currentOpenGUI = cus_gui;
    }//GEN-LAST:event_jLabel_customerMouseClicked

    private void jLabel_BookACarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookACarMouseClicked
        if (currentOpenGUI != null) {
            currentOpenGUI.dispose();
        }
        
        BookCars_GUI bc_gui = new BookCars_GUI();
        bc_gui.setVisible(true);
        currentOpenGUI = bc_gui;
    }//GEN-LAST:event_jLabel_BookACarMouseClicked

    private void jLabel_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_usersMouseClicked
        if (currentOpenGUI != null) {
            currentOpenGUI.dispose();
        }
        
        Users_GUI user_gui = new Users_GUI();
        user_gui.setVisible(true);
        currentOpenGUI = user_gui;
    }//GEN-LAST:event_jLabel_usersMouseClicked

    private void jLabel_brandsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_brandsMouseEntered
        // set white border
        jLabel_brands.setBorder(white_border);
    }//GEN-LAST:event_jLabel_brandsMouseEntered

    private void jLabel_carMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_carMouseEntered
        // set white border
        jLabel_car.setBorder(white_border);  
    }//GEN-LAST:event_jLabel_carMouseEntered

    private void jLabel_locationsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_locationsMouseEntered
        // set white border
        jLabel_locations.setBorder(white_border);
    }//GEN-LAST:event_jLabel_locationsMouseEntered

    private void jLabel_customerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_customerMouseEntered
        // set white border
        jLabel_customer.setBorder(white_border); 
    }//GEN-LAST:event_jLabel_customerMouseEntered

    private void jLabel_BookACarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookACarMouseEntered
        // set white border
        jLabel_BookACar.setBorder(white_border); 
    }//GEN-LAST:event_jLabel_BookACarMouseEntered

    private void jLabel_usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_usersMouseEntered
        // set white border
        jLabel_users.setBorder(white_border); 
    }//GEN-LAST:event_jLabel_usersMouseEntered

    private void jLabel_brandsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_brandsMouseExited
        // set empty border
        jLabel_brands.setBorder(empty_border);
    }//GEN-LAST:event_jLabel_brandsMouseExited

    private void jLabel_carMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_carMouseExited
        // set empty border
        jLabel_car.setBorder(empty_border);
    }//GEN-LAST:event_jLabel_carMouseExited

    private void jLabel_locationsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_locationsMouseExited
        // set empty border
        jLabel_locations.setBorder(empty_border);
    }//GEN-LAST:event_jLabel_locationsMouseExited

    private void jLabel_customerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_customerMouseExited
        // set empty border
        jLabel_customer.setBorder(empty_border);
    }//GEN-LAST:event_jLabel_customerMouseExited

    private void jLabel_BookACarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookACarMouseExited
        // set empty border
        jLabel_BookACar.setBorder(empty_border);
    }//GEN-LAST:event_jLabel_BookACarMouseExited

    private void jLabel_usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_usersMouseExited
        // set empty border
        jLabel_users.setBorder(empty_border);
    }//GEN-LAST:event_jLabel_usersMouseExited

    private void jLabel_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_logoutMouseClicked
        if (currentOpenGUI != null) {
            currentOpenGUI.dispose();
            currentOpenGUI = null; 
        }
        
        this.dispose();
        
        Login_GUI login_gui = new Login_GUI(); 
        login_gui.setVisible(true);
    }//GEN-LAST:event_jLabel_logoutMouseClicked

    private void jLabel_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_logoutMouseEntered
        jLabel_logout.setBorder(white_border);
    }//GEN-LAST:event_jLabel_logoutMouseEntered

    private void jLabel_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_logoutMouseExited
        jLabel_logout.setBorder(empty_border);
    }//GEN-LAST:event_jLabel_logoutMouseExited

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
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_BookACar;
    private javax.swing.JLabel jLabel_booked_count;
    private javax.swing.JLabel jLabel_booked_logo;
    private javax.swing.JLabel jLabel_brands;
    private javax.swing.JLabel jLabel_car;
    private javax.swing.JLabel jLabel_cars_count;
    private javax.swing.JLabel jLabel_cars_logo;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_customer;
    private javax.swing.JLabel jLabel_customers_count;
    private javax.swing.JLabel jLabel_customers_logo;
    private javax.swing.JLabel jLabel_locations;
    public static javax.swing.JLabel jLabel_logout;
    public static javax.swing.JLabel jLabel_userProfilePic;
    public static javax.swing.JLabel jLabel_username;
    public static javax.swing.JLabel jLabel_users;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
