/*
 * file:       MpxQuery.java
 * author:     Jon Iles
 * copyright:  (c) Tapster Rock Limited 2002-2003
 * date:       13/02/2003
 */

/*
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */

import com.tapsterrock.mpx.MPXFile;
import com.tapsterrock.mpx.Task;
import com.tapsterrock.mpx.Resource;
import com.tapsterrock.mpx.ResourceAssignment;
import java.util.Iterator;
import java.util.List;


/**
 * This example shows an MPX file being read, and basic task and resource
 * data being extracted.
 */
public class MpxQuery
{
   /**
    * Main method.
    *
    * @param args array of command line arguments
    */
   public static void main (String[] args)
   {
      try
      {
         if (args.length != 1)
         {
            System.out.println ("Usage: MppQuery <input mpx file name>");
         }
         else
         {
            query (args[0]);
         }
      }

      catch (Exception ex)
      {
         ex.printStackTrace(System.out);
      }
   }

   /**
    * This method performs a set of queries to retrieve information
    * from the MPX file.
    *
    * @param filename name of the MPX file
    * @throws Exception on file read error
    */
   private static void query (String filename)
      throws Exception
   {
      MPXFile file = new MPXFile (filename);

      listResources (file);

      listTasks (file);

      listAssignments (file);

      listHierarchy (file);
   }

   /**
    * This method lists all resources defined in the file.
    *
    * @param file MPX file
    */
   private static void listResources (MPXFile file)
   {
      List allResources = file.getAllResources();
      Iterator iter = allResources.iterator();
      Resource resource;

      while (iter.hasNext() == true)
      {
         resource = (Resource)iter.next();
         System.out.println ("Resource: " + resource.getName());
      }
      System.out.println ();
   }


   /**
    * This method lists all tasks defined in the file.
    *
    * @param file MPX file
    */
   private static void listTasks (MPXFile file)
   {
      List allTasks = file.getAllTasks();
      Iterator iter = allTasks.iterator();
      Task task;

      while (iter.hasNext() == true)
      {
         task = (Task)iter.next();
         System.out.println ("Task: " + task.getName());
      }
      System.out.println ();
   }


   /**
    * This method lists all tasks defined in the file in a hierarchical
    * format, reflecting the parent-child relationships between them.
    *
    * @param file MPX file
    */
   private static void listHierarchy (MPXFile file)
   {
      List tasks = file.getChildTasks();
      Iterator iter = tasks.iterator();
      Task task;

      while (iter.hasNext() == true)
      {
         task = (Task)iter.next();
         System.out.println ("Task: " + task.getName());
         listHierarchy (task, " ");
      }

      System.out.println ();
   }

   /**
    * Helper method called recursively to list child tasks.
    *
    * @param task task whose children are to be displayed
    * @param indent whitespace used to indent hierarchy levels
    */
   private static void listHierarchy (Task task, String indent)
   {
      List tasks = task.getChildTasks();
      Iterator iter = tasks.iterator();
      Task child;

      while (iter.hasNext() == true)
      {
         child = (Task)iter.next();
         System.out.println (indent + "Task: " + child.getName());
         listHierarchy (child, indent + " ");
      }
   }

   /**
    * This method lists all resource assignments defined in the file.
    *
    * @param file MPX file
    */
   private static void listAssignments (MPXFile file)
   {
      List allAssignments = file.getAllResourceAssignments();
      Iterator iter = allAssignments.iterator();
      ResourceAssignment assignment;
      Task task;
      Resource resource;

      while (iter.hasNext() == true)
      {
         assignment = (ResourceAssignment)iter.next();
         task = assignment.getTask ();
         resource = assignment.getResource ();
         System.out.println ("Assignment: Task=" + task.getName() + " Resource=" + resource.getName());
      }

      System.out.println ();
   }

}
