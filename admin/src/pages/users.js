import React from 'react';
import { List, Datagrid, DateField, EmailField, TextField, BooleanField, EditButton, DisabledInput, SimpleForm, Edit, BooleanInput, Filter, ReferenceInput, SelectInput } from 'react-admin';

const UserFilter = (props) => (
    <Filter {...props}>
      <ReferenceInput label="User" source="id" reference="users" allowEmpty>
        <SelectInput optionText="username" />
      </ReferenceInput>
    </Filter>
);

export const UserList = (props) => (
    <List {...props} filters={<UserFilter/>}>
      <Datagrid>
        <TextField source="id" />
        <EmailField source="username" />
        <TextField source="firstName" />
        <TextField source="lastName" />
        <DateField source="created" showTime />
        <BooleanField source="enabled" />
        <EditButton basePath="/users" />
      </Datagrid>
    </List>
);

const UserTitle = ({ record }) => {
  return <span>User {record ? `"${record.username}"` : ''}</span>;
};

export const UserEdit = (props) => (
    <Edit title={<UserTitle />} {...props}>
      <SimpleForm>
        <DisabledInput source="id" />
        <DisabledInput source="username" />
        <DisabledInput label="First Name" source="firstName" />
        <DisabledInput label="Last Name" source="lastName" />
        <BooleanInput source="enabled" />
      </SimpleForm>
    </Edit>
);