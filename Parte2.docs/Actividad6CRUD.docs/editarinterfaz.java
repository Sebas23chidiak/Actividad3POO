<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.3" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
  <Properties>
    <Property name="defaultCloseOperation" type="int" value="3"/>
  </Properties>
  <SyntheticProperties>
    <SyntheticProperty name="formSizePolicy" type="int" value="1"/>
    <SyntheticProperty name="generateCenter" type="boolean" value="false"/>
  </SyntheticProperties>
  <AuxValues>
    <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
    <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
    <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
  </AuxValues>

  <Layout>
    <DimensionLayout dim="0">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" attributes="0">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace min="-2" pref="35" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="0" max="-2" attributes="0">
                          <Component id="jScrollPane1" max="32767" attributes="0"/>
                          <Component id="jLabel2" alignment="0" min="-2" pref="303" max="-2" attributes="0"/>
                      </Group>
                  </Group>
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace min="-2" pref="80" max="-2" attributes="0"/>
                      <Component id="guardar" min="-2" max="-2" attributes="0"/>
                      <EmptySpace min="-2" pref="63" max="-2" attributes="0"/>
                      <Component id="salir" min="-2" max="-2" attributes="0"/>
                  </Group>
              </Group>
              <EmptySpace min="-2" pref="35" max="-2" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" attributes="0">
              <EmptySpace min="-2" pref="35" max="-2" attributes="0"/>
              <Component id="jLabel2" min="-2" pref="42" max="-2" attributes="0"/>
              <EmptySpace type="separate" max="-2" attributes="0"/>
              <Component id="jScrollPane1" min="-2" pref="175" max="-2" attributes="0"/>
              <EmptySpace min="-2" pref="35" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="3" attributes="0">
                  <Component id="guardar" alignment="3" min="-2" max="-2" attributes="0"/>
                  <Component id="salir" alignment="3" min="-2" max="-2" attributes="0"/>
              </Group>
              <EmptySpace pref="28" max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Component class="javax.swing.JButton" name="guardar">
      <Properties>
        <Property name="text" type="java.lang.String" value="Guardar"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="guardarActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel2">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI" size="24" style="0"/>
        </Property>
        <Property name="horizontalAlignment" type="int" value="0"/>
        <Property name="text" type="java.lang.String" value="Editar"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JButton" name="salir">
      <Properties>
        <Property name="text" type="java.lang.String" value="Cancelar"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="salirActionPerformed"/>
      </Events>
    </Component>
    <Container class="javax.swing.JScrollPane" name="jScrollPane1">
      <AuxValues>
        <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
      </AuxValues>

      <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
      <SubComponents>
        <Component class="javax.swing.JTextArea" name="jTextArea1">
          <Properties>
            <Property name="columns" type="int" value="20"/>
            <Property name="rows" type="int" value="5"/>
          </Properties>
        </Component>
      </SubComponents>
    </Container>
  </SubComponents>
</Form>
